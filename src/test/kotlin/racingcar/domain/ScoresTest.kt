package racingcar.domain

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class ScoresTest {
    @Test
    fun `자동차 스코어 목록을 추가 할 수 있다`() {
        val score1 = Score(7)
        val score2 = Score(10)
        val score3 = Score(5)
        val scores = Scores(listOf(score1, score2, score3))
        scores.run {
            findAllScores()[0].point shouldBe 7
            findAllScores()[1].point shouldBe 10
            findAllScores()[2].point shouldBe 5
        }
    }

    @Test
    fun `자동차 스코어 목록을 추가한 횟수와 스코어 사이즈는 같다`() {
        val score1 = Score(7)
        val score2 = Score(10)
        val scores = Scores(listOf(score1, score2))
        scores.run {
            size() shouldBe 2
        }
    }
}
