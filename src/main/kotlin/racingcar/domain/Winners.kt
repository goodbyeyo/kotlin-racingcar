package racingcar.domain

class Winners(carNames: List<CarName>) {
    private val _names: MutableList<CarName> = carNames.toMutableList()
    val names: List<CarName>
        get() = _names.toList()
    constructor() : this(mutableListOf())

    fun addWinner(carName: String) {
        _names.add(CarName(carName))
    }
}
