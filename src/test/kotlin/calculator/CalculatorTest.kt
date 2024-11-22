package calculator

import calculator.view.InputView
import io.kotest.matchers.shouldBe
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class CalculatorTest {
    @Test
    fun `0으로 나눌수 없다`() {
        assertThat(
            assertThrows<IllegalArgumentException> {
                Calculator(Expression(InputView(Input("5 / 0")))).calculate()
            }.message,
        ).isEqualTo("0으로 나눌 수 없습니다")
    }

    @ParameterizedTest
    @MethodSource("providedAdditionExpression")
    fun `덧셈 연산 결과를 얻을수 있다`(
        additionInput: Input,
        result: Int,
    ) {
        val actual = Calculator(Expression(InputView(additionInput))).calculate().number
        actual shouldBe result
    }

    @ParameterizedTest
    @MethodSource("providedSubtractionExpression")
    fun `뺄셈 연산 결과를 얻을수 있다`(
        subtractionInput: Input,
        result: Int,
    ) {
        val actual = Calculator(Expression(InputView(subtractionInput))).calculate().number
        actual shouldBe result
    }

    @ParameterizedTest
    @MethodSource("providedMultiplyExpression")
    fun `곱셈 연산 결과를 얻을수 있다`(
        multiplyInput: Input,
        result: Int,
    ) {
        val actual = Calculator(Expression(InputView(multiplyInput))).calculate().number
        actual shouldBe result
    }

    @ParameterizedTest
    @MethodSource("providedDivisionExpression")
    fun `나눗셈 연산 결과를 얻을수 있다`(
        divisionInput: Input,
        result: Int,
    ) {
        val actual = Calculator(Expression(InputView(divisionInput))).calculate().number
        actual shouldBe result
    }

    @Test
    fun `계산식을 입력하면 결과를 얻을 수 있다`() {
        val result = Calculator(Expression(InputView(Input("1 + 4 * 3 - 5 / 2")))).calculate()
        assertThat(result.number).isEqualTo(5)
    }

    companion object {
        @JvmStatic
        fun providedAdditionExpression() =
            listOf(
                Arguments.arguments(Input("1 + 3"), 4),
                Arguments.arguments(Input("10 + 80"), 90),
                Arguments.arguments(Input("101 + 99"), 200),
            )

        @JvmStatic
        fun providedSubtractionExpression() =
            listOf(
                Arguments.arguments(Input("2 - 1"), 1),
                Arguments.arguments(Input("100 - 80"), 20),
                Arguments.arguments(Input("101 - 99"), 2),
            )

        @JvmStatic
        fun providedMultiplyExpression() =
            listOf(
                Arguments.arguments(Input("2 * 1"), 2),
                Arguments.arguments(Input("10 * 8"), 80),
                Arguments.arguments(Input("150 * 30"), 4500),
            )

        @JvmStatic
        fun providedDivisionExpression() =
            listOf(
                Arguments.arguments(Input("2 / 1"), 2),
                Arguments.arguments(Input("100 / 5"), 20),
                Arguments.arguments(Input("150 / 30"), 5),
            )
    }
}
