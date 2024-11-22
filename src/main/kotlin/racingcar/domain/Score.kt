package racingcar.domain

class Score (
    private val point: Int,
    private val car: Car
) {
    fun findPoint(car: Car): Int {
        return point
    }
}
