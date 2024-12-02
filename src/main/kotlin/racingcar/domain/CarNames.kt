package racingcar.domain

class CarNames(carNames: List<CarName>) : Iterable<CarName> {
    private val _names = carNames

    private val names: List<CarName>
        get() = _names.toList()

    fun count(): Int {
        return names.size
    }

    fun name(index: Int): CarName {
        return names[index]
    }

    override fun iterator(): Iterator<CarName> {
        return names.iterator()
    }
}
