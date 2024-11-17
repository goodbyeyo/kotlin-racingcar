package racingcar.domain

class Scores {
    private val scores: MutableList<Score>

    init {
        scores = ArrayList()
    }

    fun findAllScores(): List<Score> {
        return scores
    }
}
