package racingcar.domain

class CarNames(carNames: List<CarName>) {
    private val _names: MutableList<CarName> = carNames.toMutableList()
    private val names: List<CarName>
        get() = _names.toList()

    fun findAllCarNames(): List<CarName> {
        return _names
    }

    fun carNameCount(): Int {
        return _names.size
    }
}