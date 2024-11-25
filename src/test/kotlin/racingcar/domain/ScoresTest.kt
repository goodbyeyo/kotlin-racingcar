package racingcar.domain

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class ScoresTest {
    @Test
    fun `자동차 스코어 목록을 추가 할 수 있다`() {
        val scores = Scores()
        val score1 = Score(7)
        val score2 = Score(10)
        val score3 = Score(5)
        scores.run {
            addScore(score1)
            addScore(score2)
            addScore(score3)
            findAllScores().get(0).findPoint() shouldBe 7
            findAllScores().get(1).findPoint() shouldBe 10
            findAllScores().get(2).findPoint() shouldBe 5
        }
    }

    @Test
    fun `자동차 스코어 목록을 추가한 횟수와 스코어 사이즈는 같다`() {
        val scores = Scores()
        val score1 = Score(7)
        val score2 = Score(10)
        scores.run {
            addScore(score1)
            addScore(score2)
            size() shouldBe 2
        }
    }
}
