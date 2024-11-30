package racingcar.domain

import racingcar.strategy.NumberGeneratorStrategy

class Car(
    point: Int = 0,
    name: CarName,
) {
    constructor(name: CarName) : this(0, name)
    constructor(point: Int) : this(point, CarName(BLANK_NAME))
    constructor() : this(0, CarName(BLANK_NAME))

    var point: Int = point
        private set
    val carName: CarName = name

    fun move() {
        point += 1
    }

    fun move(numberGeneratorStrategy: NumberGeneratorStrategy) {
        if (numberGeneratorStrategy.isMovable()) {
            point += 1
        }
    }

    companion object {
        const val BLANK_NAME = ""
    }
}
