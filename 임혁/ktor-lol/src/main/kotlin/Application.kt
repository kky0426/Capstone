import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import io.ktor.client.request.*


// 테스트용 api
// Expires: Fri, Mar 19th, 2021 @ 4:31am (PT) in 23 hours
// RATE LIMITS
// 20 requests every 1 seconds(s)
// 100 requests every 2 minutes(s)
val API_KEY = "RGAPI-f1938eab-5f3c-4b1b-a84f-82030da5961d"


val URL = "https://kr.api.riotgames.com"
val SUMMONER_V4 = "/lol/summoner/v4/summoners"

val BY_NAME = "/by-name/"


suspend fun main() {
    val name = "Hestia sin" // 이름
    val summonerName = name.replace(" ", "%20")

    val requestURL = "$URL$SUMMONER_V4$BY_NAME$summonerName"

    val client = HttpClient(CIO) {
        install(JsonFeature) {
            serializer = GsonSerializer()
        }
    }

    val response: Summoner = client.get(requestURL) {
        header("X-Riot-Token", "RGAPI-f1938eab-5f3c-4b1b-a84f-82030da5961d")
    }

    println(response)
    client.close()
}