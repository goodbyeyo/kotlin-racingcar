package racingcar.domain

import io.kotest.matchers.shouldBe
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class CarsTest {
    @ParameterizedTest
    @CsvSource("1, 1", "5, 5", "15, 15")
    fun `전달받은 수만큼 자동차를 생성 할 수 있다`(
        count: String,
        createdCount: Int,
    ) {
        val cars = Cars(PositiveNumber(count))
        val carCount = cars.count()
        carCount shouldBe createdCount
    }
}
