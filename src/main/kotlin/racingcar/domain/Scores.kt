package racingcar.domain

class Scores(scores: List<Score>) {
    private val _scores: MutableList<Score> = scores.toMutableList()
    private val scores: List<Score>
        get() = _scores.toList()

    constructor() : this(mutableListOf())

    fun findAllScores(): List<Score> {
        return _scores
    }

    fun addScore(score: Score) {
        _scores.add(score)
    }

    fun size(): Int {
        return _scores.size
    }

    fun score(index: Int): Score {
        return scores[index]
    }

    fun findWinner(): Winners {
        val maxScore = findMaxScore()
        val winners = Winners()
        _scores.filter { score -> score.isSameScore(maxScore) }
            .forEach { winners.addWinner(it.carName) }
        return winners
    }

    private fun findMaxScore(): Int {
        return _scores.maxByOrNull { it.point }?.point ?: 0
    }
}
