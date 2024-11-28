package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class PositiveNumberTest {
    @Test
    fun `자동차 수와 게임 라운드 수는 공백을 입력 할 수 없다`() {
        assertThat(
            assertThrows<IllegalArgumentException> { PositiveNumber("") }.message,
        ).isEqualTo("공백 일 수 없습니다")
    }

    @Test
    fun `자동차 수와 게임 라운드 수는 양수만 입력 가능하다`() {
        assertThat(
            assertThrows<IllegalArgumentException> { PositiveNumber("-5") }.message,
        ).isEqualTo("양수만 입력 가능합니다")
    }
}
