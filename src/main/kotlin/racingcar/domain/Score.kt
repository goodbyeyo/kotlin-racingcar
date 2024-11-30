package racingcar.domain

data class Score(
    val car: Car,
) {
    constructor(point: Int) : this(Car(point))

    val point: Int = car.point
    val carName: String = car.carName.name

    fun isSameScore(maxScore: Int): Boolean {
        return point == maxScore
    }
}
