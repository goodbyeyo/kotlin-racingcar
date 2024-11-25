package calculator

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class ExpressionTest {
    @ParameterizedTest
    @MethodSource("providedWrongExpression")
    fun `올바르지 않은 계산식 입력하면 예외가 발생한다`(wrongExpression: UnparsedExpression) {
        assertThat(
            assertThrows<IllegalArgumentException> {
                Expression(wrongExpression)
            }.message,
        ).isEqualTo("계산할 수식이 올바르지 않습니다")
    }

    @Test
    fun `올바른 계산식을 입력하면 피연산자를 분리 할 수 있다`() {
        val expression = Expression(UnparsedExpression("2 * 9 / 3"))
        val numbers = expression.operands.numbers
        assertThat(numbers.contains(Operand(2))).isTrue()
        assertThat(numbers.contains(Operand(9))).isTrue()
        assertThat(numbers.contains(Operand(3))).isTrue()
    }

    @Test
    fun `올바른 계산식을 입력하면 연산자를 분리 할 수 있다`() {
        val expression = Expression(UnparsedExpression("18 / 3 * 8"))
        val operators = expression.symbols.operators
        assertThat(operators.contains("*")).isTrue()
        assertThat(operators.contains("/")).isTrue()
    }

    companion object {
        @JvmStatic
        fun providedWrongExpression() =
            listOf(
                Arguments.arguments(UnparsedExpression("1 3 7 50 + * -")),
                Arguments.arguments(UnparsedExpression("x 1 5 2xxx")),
                Arguments.arguments(UnparsedExpression("101 99 +")),
            )
    }
}
