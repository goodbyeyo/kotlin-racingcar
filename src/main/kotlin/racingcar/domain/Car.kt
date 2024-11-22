package racingcar.domain

import racingcar.strategy.NumberGeneratorStrategy

class Car(
    var point: Int? = 0,
) {
    fun move() {
        point = point!! + 1
    }

    fun move(numberGeneratorStrategy: NumberGeneratorStrategy) {
        if (numberGeneratorStrategy.isMovable(numberGeneratorStrategy.generateNumber())) {
            point = point!! + 1
        }
    }
}
