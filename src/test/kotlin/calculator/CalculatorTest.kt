package calculator

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
                Calculator(Expression(UnparsedExpression("5 / 0"))).calculate()
            }.message,
        ).isEqualTo("0으로 나눌 수 없습니다")
    }

    @ParameterizedTest
    @MethodSource("providedAdditionExpression")
    fun `덧셈 연산 결과를 얻을수 있다`(
        additionUnparsedExpression: UnparsedExpression,
        result: Int,
    ) {
        val actual = Calculator(Expression(additionUnparsedExpression)).calculate().number
        actual shouldBe result
    }

    @ParameterizedTest
    @MethodSource("providedSubtractionExpression")
    fun `뺄셈 연산 결과를 얻을수 있다`(
        subtractionUnparsedExpression: UnparsedExpression,
        result: Int,
    ) {
        val actual = Calculator(Expression(subtractionUnparsedExpression)).calculate().number
        actual shouldBe result
    }

    @ParameterizedTest
    @MethodSource("providedMultiplyExpression")
    fun `곱셈 연산 결과를 얻을수 있다`(
        multiplyUnparsedExpression: UnparsedExpression,
        result: Int,
    ) {
        val actual = Calculator(Expression(multiplyUnparsedExpression)).calculate().number
        actual shouldBe result
    }

    @ParameterizedTest
    @MethodSource("providedDivisionExpression")
    fun `나눗셈 연산 결과를 얻을수 있다`(
        divisionUnparsedExpression: UnparsedExpression,
        result: Int,
    ) {
        val actual = Calculator(Expression(divisionUnparsedExpression)).calculate().number
        actual shouldBe result
    }

    @Test
    fun `계산식을 입력하면 결과를 얻을 수 있다`() {
        val result = Calculator(Expression(UnparsedExpression("1 + 4 * 3 - 5 / 2"))).calculate()
        assertThat(result.number).isEqualTo(5)
    }

    companion object {
        @JvmStatic
        fun providedAdditionExpression() =
            listOf(
                Arguments.arguments(UnparsedExpression("1 + 3"), 4),
                Arguments.arguments(UnparsedExpression("10 + 80"), 90),
                Arguments.arguments(UnparsedExpression("101 + 99"), 200),
            )

        @JvmStatic
        fun providedSubtractionExpression() =
            listOf(
                Arguments.arguments(UnparsedExpression("2 - 1"), 1),
                Arguments.arguments(UnparsedExpression("100 - 80"), 20),
                Arguments.arguments(UnparsedExpression("101 - 99"), 2),
            )

        @JvmStatic
        fun providedMultiplyExpression() =
            listOf(
                Arguments.arguments(UnparsedExpression("2 * 1"), 2),
                Arguments.arguments(UnparsedExpression("10 * 8"), 80),
                Arguments.arguments(UnparsedExpression("150 * 30"), 4500),
            )

        @JvmStatic
        fun providedDivisionExpression() =
            listOf(
                Arguments.arguments(UnparsedExpression("2 / 1"), 2),
                Arguments.arguments(UnparsedExpression("100 / 5"), 20),
                Arguments.arguments(UnparsedExpression("150 / 30"), 5),
            )
    }
}
