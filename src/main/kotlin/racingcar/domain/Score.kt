package racingcar.domain

import racingcar.domain.Car.Companion.BLANK_NAME

data class Score(
    val point: Int,
    val carName: String,
) {
    constructor(car: Car) : this(car.point, car.carName.name)
    constructor(point: Int) : this(point, BLANK_NAME)

    fun isSameScore(maxScore: Int): Boolean {
        return point == maxScore
    }
}
