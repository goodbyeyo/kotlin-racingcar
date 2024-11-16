package calculator

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class OperatorTest {
    @Test
    fun `더하기 빼기 곱하기 나누기 이외의 연산기호는 허용하지 않는다`() {
        Assertions.assertThat(
            assertThrows<IllegalArgumentException> {
                Operator.of("&")
            }.message,
        ).isEqualTo("올바른 사칙연산 기호가 아닙니다")
    }
}
