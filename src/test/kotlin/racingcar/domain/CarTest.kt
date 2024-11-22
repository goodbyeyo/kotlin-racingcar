package racingcar.domain

import io.kotest.matchers.shouldBe
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.strategy.MovableNumberGeneratorStrategy
import racingcar.strategy.NonMovableNumberGenerator

class CarTest {
    @Test
    fun `자동차의 위치값을 초기화 하지 않고 생성하면 0이다 `() {
        val car = Car()
        car.point shouldBe 0
    }

    @Test
    fun `자동차를 이동하면 점수가 1 오른다`() {
        val car = Car()
        car.move()
        car.point shouldBe 1
    }

    @Test
    fun `자동차를 정지전략으로 이동하면 점수가 오르지 않는다`() {
        val car = Car()
        car.move(NonMovableNumberGenerator())
        car.point shouldBe 0
    }

    @Test
    fun `자동차를 이동전략으로 이동하면 점수가 1 오른다`() {
        val car = Car(3)
        car.move(MovableNumberGeneratorStrategy())
        car.point shouldBe 4
    }

    @Test
    fun `자동차를 랜덤전략으로 이동하면 점수가 그대로이거나 하나 증가한다`() {
        val car = Car(5)
        car.move(MovableNumberGeneratorStrategy())
        assertThat(car.point).isIn(5, 6)
    }
}
