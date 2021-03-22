data class LeagueEntry(
    val leagueId: String,
    val queueType: String, // RANKED_SOLO_5x5
    val tier: String, // SILVER
    val rank: String, // I
    val summonerId: String,
    val summonerName: String,
    val leaguePoints: Int, // 점수
    val wins: Int,
    val losses: Int,
    val veteran: Boolean,
    val inactive: Boolean,
    val freshBlood: Boolean,
    val hotStreak: Boolean
)