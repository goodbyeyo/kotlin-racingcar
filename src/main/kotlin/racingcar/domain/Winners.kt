package racingcar.domain

class Winners(carNames: List<CarName>) {
    private val _winners: MutableList<CarName> = carNames.toMutableList()
    constructor() : this(mutableListOf())

    val carNames: List<CarName>
        get() = _winners.toList()

    fun addWinner(carName: String) {
        _winners.add(CarName(carName))
    }
}
