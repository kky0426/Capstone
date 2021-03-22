data class MatchTimeline(
    val frames: List<MatchFrame>,
    val frameInterval: Long
)

data class MatchFrame(
    val participantFrames: Map<String, MatchParticipantFrame>,
    val events: List<MatchEvent>,
    val timestamp: Long
)

data class MatchParticipantFrame(
    val participantId: Int,
    val minionsKilled: Int,
    val teamScore: Int,
    val dominionScore: Int,
    val totalGold: Int,
    val level: Int,
    val xp: Int,
    val currentGold: Int,
    val position: MatchPosition,
    val jungleMinionsKilled: Int
)

data class MatchPosition(
    val x: Int,
    val y: Int
)

data class MatchEvent(
    val laneType: String,
    val skillSlot: Int,
    val ascendedType: String,
    val creatorId: Int,
    val afterId: Int,
    val eventType: String,
    val type: String,
    val levelUpType: String,
    val wardType: String,
    val participantId: Int,
    val towerType: String,
    val itemId: Int,
    val beforeId: Int,
    val pointCaptured: String,
    val monsterType: String,
    val monsterSubType: String,
    val teamId: Int,
    val position: MatchPosition,
    val killerId: Int,
    val timestamp: Long,
    val assistingParticipantIds: List<Int>,
    val buildingType: String,
    val victimId: Int
)

