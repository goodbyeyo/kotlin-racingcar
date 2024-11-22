package racingcar.domain

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import racingcar.dto.UserInput
import racingcar.strategy.MovableNumberGeneratorStrategy
import racingcar.strategy.NonMovableNumberGenerator
import racingcar.strategy.RandomNumberGeneratorStrategy

class RacingCarGameTest {
    @Test
    fun `전진 전략으로 1회 레이스를 진행하면 모든 차들의 위치는 1씩 증가한다`() {
        val carNumber = PositiveNum("5")
        val gameRound = PositiveNum("1")
        val userInput = UserInput(carNumber, gameRound)
        val racingCarGame = RacingCarGame(userInput, MovableNumberGeneratorStrategy())
        val scores = racingCarGame.race(Cars(carNumber))
        val points = scores.findAllScores().map { it.findPoint() }
        points shouldBe listOf(1, 1, 1, 1, 1)
    }

    @Test
    fun `정지 전략으로 1회 레이스를 진행하면 모든 차들의 위치는 변하지 않는다`() {
        val carNumber = PositiveNum("5")
        val gameRound = PositiveNum("1")
        val userInput = UserInput(carNumber, gameRound)
        val racingCarGame = RacingCarGame(userInput, NonMovableNumberGenerator())
        val scores = racingCarGame.race(Cars(carNumber))
        val points = scores.findAllScores().map { it.findPoint() }
        points shouldBe listOf(0, 0, 0, 0, 0)
    }

    @ParameterizedTest
    @ValueSource(strings = ["1", "9", "25"])
    fun `스코어의 결과 사이즈는 게임 라운드 수와 동일하다`(round: String) {
        val carNumber = PositiveNum("5")
        val gameRound = PositiveNum(round)
        val userInput = UserInput(carNumber, gameRound)
        val racingCarGame = RacingCarGame(userInput, RandomNumberGeneratorStrategy())
        val scores = racingCarGame.startGame()
        scores.size shouldBe round.toInt()
    }
}
