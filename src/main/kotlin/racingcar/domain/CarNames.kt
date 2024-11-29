package racingcar.domain

class CarNames(carNames: List<CarName>) {
    private val _names: MutableList<CarName> = carNames.toMutableList()

    private val names: List<CarName>
        get() = _names.toList()

    fun findAllCarNames(): List<CarName> {
        return _names
    }

    fun count(): Int {
        return _names.size
    }

    fun name(index: Int): CarName {
        return _names[index]
    }
}
