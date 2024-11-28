package racingcar.domain

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import racingcar.strategy.MovableNumberGeneratorStrategy
import racingcar.strategy.NonMovableNumberGenerator

class RaceTest {
    @Test
    fun `전진 전략으로 1회 레이스를 진행하면 모든 차들의 위치는 1씩 증가한다`() {
        val carCount = PositiveNumber("5")
        val cars = Cars(carCount)
        val scores = Race(cars, MovableNumberGeneratorStrategy()).raceOneRound()
        val points = scores.findAllScores().map { it.point }
        points shouldBe listOf(1, 1, 1, 1, 1)
    }

    @Test
    fun `정지 전략으로 1회 레이스를 진행하면 모든 차들의 위치는 변하지 않는다`() {
        val carCount = PositiveNumber("5")
        val cars = Cars(carCount)
        val scores = Race(cars, NonMovableNumberGenerator()).raceOneRound()
        val points = scores.findAllScores().map { it.point }
        points shouldBe listOf(0, 0, 0, 0, 0)
    }
}
