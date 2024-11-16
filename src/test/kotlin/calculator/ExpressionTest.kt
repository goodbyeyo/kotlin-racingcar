package calculator

import calculator.view.InputView
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class ExpressionTest {
    @Test
    fun `피연산자의 수는 연산기호의 수보다 하나 더 많아야 한다`() {
        assertThat(
            assertThrows<IllegalArgumentException> {
                Expression(InputView("1 + 5 * 7 -"))
            }.message,
        ).isEqualTo("피연산자와 연산기호의 수가 올바르지 않습니다")
    }

    @Test
    fun `올바르지 않은 계산식을 입력하면 예외가 발생한다`() {
        assertThat(
            assertThrows<IllegalArgumentException> {
                Expression(InputView("x 1 5 2xxx 8y"))
            }.message,
        ).isEqualTo("피연산자와 연산기호의 수가 올바르지 않습니다")
    }

    @Test
    fun `올바른 계산식을 입력하면 피연산자를 분리 할 수 있다`() {
        val expression = Expression(InputView("2 * 9 / 3"))
        val numbers = expression.operands.numbers
        assertThat(numbers.contains(Operand(2))).isTrue()
        assertThat(numbers.contains(Operand(9))).isTrue()
        assertThat(numbers.contains(Operand(3))).isTrue()
    }

    @Test
    fun `올바른 계산식을 입력하면 연산자를 분리 할 수 있다`() {
        val expression = Expression(InputView("18 / 3 * 8"))
        val operators = expression.symbols.operators
        assertThat(operators.contains("*")).isTrue()
        assertThat(operators.contains("/")).isTrue()
    }
}
