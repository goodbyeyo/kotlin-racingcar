package racingcar.domain

import racingcar.strategy.NumberGeneratorStrategy

class Car(
    var point: Int = 0,
) {
    fun move() {
        point += 1
    }

    fun move(numberGeneratorStrategy: NumberGeneratorStrategy) {
        if (numberGeneratorStrategy.isMovable(numberGeneratorStrategy.generateNumber())) {
            point += 1
        }
    }

    fun findPoint(): Int {
        return point
    }
}
