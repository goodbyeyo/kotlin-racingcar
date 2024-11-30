package racingcar.dto

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.inspectors.forAll
import racingcar.domain.PositiveNumber

class UserInputTest : BehaviorSpec({
    val negativeNumer = "-5"
    Given("자동차 경주 게임에서 시작 값을 입력할때") {
        When("게임 라운드 수를 양수가 아닌 수를 입력하면") {
            Then("예외가 발생한다") {
                negativeNumbers.forAll {
                    shouldThrow<IllegalArgumentException> {
                        PositiveNumber(negativeNumer)
                    }
                }
            }
        }
    }
}) {
    companion object {
        private val negativeNumbers = listOf(-1, -100, -55, -555)
    }
}
