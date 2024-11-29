package racingcar.domain

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class CarNameTest {
    @ParameterizedTest
    @ValueSource(strings = ["south korea", "united america", "poland"])
    fun `자동차의 이름은 5자리를 초과 할수 없다`(name: String) {
        Assertions.assertThat(
            assertThrows<IllegalArgumentException> {
                CarName(name)
            }.message,
        ).isEqualTo("자동차 이름은 5 자리를 초과 할수 없습니다")
    }
}
