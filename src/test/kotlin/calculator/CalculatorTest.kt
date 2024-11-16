package calculator

import calculator.view.InputView
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class CalculatorTest {

    @Test
    fun `0으로 나눌수 없다`() {
        assertThat(
            assertThrows<IllegalArgumentException> {
                Calculator(Expression(InputView("1 + 4 * 3 - 5 / 0"))).calculate()
            }.message
        ).isEqualTo("0으로 나눌 수 없습니다")
    }

    @Test
    fun `계산식을 입력하면 결과를 얻을 수 있다`() {
        val result = Calculator(Expression(InputView("1 + 4 * 3 - 5 / 2"))).calculate()
        assertThat(result.number).isEqualTo(5)
    }
}
