package racingcar.domain

import io.kotest.matchers.shouldBe
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import racingcar.dto.GameCondition
import racingcar.strategy.RandomNumberGeneratorStrategy

class RacingCarGameTest {
    @ParameterizedTest
    @ValueSource(strings = ["1", "9", "25"])
    fun `스코어의 결과 사이즈는 게임 라운드 수와 동일하다`(round: String) {
        val carCount = PositiveNumber("5")
        val gameRound = PositiveNumber(round)
        val gameCondition = GameCondition(carCount, gameRound)
        val racingCarGame = RacingCarGame(gameCondition, RandomNumberGeneratorStrategy())
        val scores = racingCarGame.startGame()
        scores.size shouldBe round.toInt()
    }
}
