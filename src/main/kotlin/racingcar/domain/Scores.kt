package racingcar.domain

class Scores {
    private val scores: MutableList<Score> = ArrayList()

    fun findAllScores(): List<Score> {
        return scores
    }

    fun addScore(score: Score) {
        scores.add(score)
    }

    fun size(): Int {
        return scores.size
    }

    fun addAll(scores: Scores): Scores {
        return scores.addAll(scores)
    }
}
