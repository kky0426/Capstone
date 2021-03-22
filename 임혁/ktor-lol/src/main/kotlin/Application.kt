import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import io.ktor.client.request.*


// 테스트용 api
// Expires: Fri, Mar 19th, 2021 @ 4:31am (PT) in 23 hours
// RATE LIMITS
// 20 requests every 1 seconds(s)
// 100 requests every 2 minutes(s)
const val API_KEY = "RGAPI-0654619d-d3d3-44ec-bdd3-83c26576cb10"
const val URL = "https://kr.api.riotgames.com"

suspend fun main() {

    val client = HttpClient(CIO) {
        install(JsonFeature) {
            serializer = GsonSerializer()
        }
    }

    // 이름을 통한 서머너 정보 조회
    // https://developer.riotgames.com/apis#summoner-v4/GET_getBySummonerName
    val SUMMONER_V4 = "/lol/summoner/v4/summoners"
    val BY_NAME = "/by-name/"
    val name = "Hestia sin" // 이름
    val summonerName = name.replace(" ", "%20")
    val requestURL = "$URL$SUMMONER_V4$BY_NAME$summonerName"
    val response: Summoner = client.get(requestURL) {
        header("X-Riot-Token", API_KEY)
    }
    println(response)

    // 서머너 고유 id를 통한 서머너 랭크정보 수집
    // https://developer.riotgames.com/apis#league-v4/GET_getLeagueEntriesForSummoner
    val LEAGUE_V4 = "/lol/league/v4"
    val BY_ID = "/entries/by-summoner/"
    val id = response.id
    val requestURL2 = "$URL$LEAGUE_V4$BY_ID$id"
    val response2: Array<LeagueEntry> = client.get(requestURL2) {
        header("X-Riot-Token", API_KEY)
    }
    println(response2[0])

    // 서머너 계정 id를 통한 매치 정보 수집
    // https://developer.riotgames.com/apis#match-v4/GET_getMatchlist
    val MATCH_V4 = "/lol/match/v4"
    val BY_ACCOUNTID = "/matchlists/by-account/"
    val accountId = response.accountId
    val requestURL3 = "$URL$MATCH_V4$BY_ACCOUNTID$accountId"
    val response3: Matchlist = client.get(requestURL3) {
        header("X-Riot-Token", API_KEY)
    }
    println("원딜 횟수 : ${response3.matches.filter { it.role == "DUO_CARRY" }.count()}")

    // matchId 를 통한 TimeLine 정보 수집
    // https://developer.riotgames.com/apis#match-v4/GET_getMatchTimeline
    val TIMELINE ="/timelines/by-match/"
    val matchId = response3.matches.filter { it.role == "DUO_CARRY" }[0].gameId
    val requestURL4 = "$URL$MATCH_V4$TIMELINE$matchId"
    val response4: MatchTimeline = client.get(requestURL4) {
        header("X-Riot-Token", API_KEY)
    }
    response4.frames
        .groupBy(keySelector = {matchFrame ->  matchFrame.timestamp }
            , valueTransform = {matchFrame -> matchFrame.participantFrames.mapValues { it.value.position }.filter { it.key == "1" } })
    println()
    client.close()
}