package calculator

import calculator.view.InputView
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class InputTest {
    @Test
    fun `연산문자열에 공백값을 입력할수 없다`() {
        assertThat(
            assertThrows<IllegalArgumentException> {
                InputView(Input("  "))
            }.message,
        ).isEqualTo("text should be not blank")
    }

    @Test
    fun `연산문자열에 빈값을 입력할수 없다`() {
        assertThat(
            assertThrows<IllegalArgumentException> {
                InputView(Input(""))
            }.message,
        ).isEqualTo("text should be not empty")
    }
}
