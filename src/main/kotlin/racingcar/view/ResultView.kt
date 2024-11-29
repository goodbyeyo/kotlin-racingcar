package racingcar.view

import racingcar.domain.Score
import racingcar.domain.Scores

object ResultView {
    private const val MOVE_EXPRESSION = "-"
    private const val RESULT_MESSAGE = "실행결과"

    fun printResult(allScore: List<Scores>) {
        println()
        println(RESULT_MESSAGE)
        for (scores in allScore) {
            printScore(scores.findAllScores())
        }
    }

    private fun printScore(oneRoundScores: List<Score>) {
        for (score in oneRoundScores) {
            printExpression(score)
        }
        println()
    }

    private fun printExpression(score: Score) {
        repeat(score.point) {
            print(MOVE_EXPRESSION)
        }
        println()
    }
}
