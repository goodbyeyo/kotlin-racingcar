package racingcar.domain

class Scores(scores: List<Score>) {
    private var _scores: MutableList<Score> = scores.map { it.copy() }.toMutableList()
    private val scores: List<Score>
        get() = _scores.toList()

    fun findAllScores(): List<Score> {
        return _scores
    }

    fun addScore(score: Score) {
        _scores.add(score)
    }

    fun size(): Int {
        return _scores.size
    }
}
