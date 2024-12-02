package racingcar.dto

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.inspectors.forAll
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.ValueSource
import racingcar.domain.PositiveNumber

class GameConditionTest {

    @ParameterizedTest
    @ValueSource(strings = ["-1", "-100", "-55", "-555"])
    fun `게임 라운드 수를 양수가 아닌 수를 입력하면 예외가 발생한다`(negativeNumber: String) {
        shouldThrow<IllegalArgumentException> {
            GameCondition("a,b", negativeNumber)
        }
}
    companion object {
        private val negativeNumbers = listOf(-1, -100, -55, -555)
    }
}
