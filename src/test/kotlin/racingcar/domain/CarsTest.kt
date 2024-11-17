package racingcar.domain

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.inspectors.forAll
import io.kotest.matchers.shouldBe

class CarsTest: BehaviorSpec({
    val count = 5
    Given("자동차 리스트 객체를 생성할때") {
        When("숫자를 전달하면") {
            Then("전달받은 수 만큼 자동차를 생성 할 수 있다 ") {
                val cars = Cars(count)
                val carCount = cars.findCarsCount()
                carCount shouldBe count
            }
        }
    }
})

