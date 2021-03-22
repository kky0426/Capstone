data class MatchReference(
    val platformId: String, // KR
    val gameId: Long, // matchId
    val champion: Int, //
    val queue: Int,
    val season: Int, // 13
    val timestamp: Long,
    val role: String, // DUO_CARRY
    val lane: String // BOTTOM
)