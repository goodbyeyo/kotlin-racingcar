package racingcar.domain

import racingcar.domain.Car.Companion.BLANK_NAME
import racingcar.strategy.NumberGeneratorStrategy

class Cars(carNames: CarNames, carCount: PositiveNumber) {
    private val _cars: MutableList<Car> = ArrayList()
    private val cars: List<Car>
        get() = _cars.toList()

    constructor(carCount: PositiveNumber) : this(CarNames(Array<CarName>(carCount.number) { CarName(BLANK_NAME) }.toList()), carCount)
    constructor(carNames: CarNames) : this(carNames, PositiveNumber(carNames.count().toString()))

    init {
        createCars(carNames)
    }

    private fun createCars(carNames: CarNames): List<Car> {
        val cars = carNames.map { Car(it)}
        _cars.addAll(cars)
        return _cars
    }

    fun count(): Int {
        return cars.size
    }

    fun move(strategy: NumberGeneratorStrategy): Scores {
        val scores = cars.map {
            it.move(strategy)
            Score(it)
        }
        return Scores(scores)
    }
}
