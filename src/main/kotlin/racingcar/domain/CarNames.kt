package racingcar.domain

class CarNames(carNames: List<CarName>) {
    private val _names: MutableList<CarName> = carNames.toMutableList()

    private val names: List<CarName>
        get() = _names.toList()

    fun count(): Int {
        return names.size
    }

    fun name(index: Int): CarName {
        return names[index]
    }
}
