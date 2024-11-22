package racingcar.domain

class Score(
    private val car: Car,
) {
    fun findPoint(): Int {
        return car.findPoint()
    }
}
