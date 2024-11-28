package racingcar.domain

import racingcar.strategy.NumberGeneratorStrategy

class Car(
    point: Int = 0,
) {
    var point: Int = point
        private set

    fun move() {
        point += 1
    }

    fun move(numberGeneratorStrategy: NumberGeneratorStrategy) {
        if (numberGeneratorStrategy.isMovable()) {
            point += 1
        }
    }
}
