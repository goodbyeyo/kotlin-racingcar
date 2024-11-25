package calculator

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class OperandTest {
    @Test
    fun `피연산자는 반드시 양수여야 한다`() {
        Assertions.assertThat(
            org.junit.jupiter.api.assertThrows<IllegalArgumentException> {
                Operand(-1)
            }.message,
        ).isEqualTo("피연산자는 0보다 큰 숫자를 입력해주세요")
    }
}
