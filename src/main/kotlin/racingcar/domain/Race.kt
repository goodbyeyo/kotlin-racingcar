package racingcar.domain

import racingcar.strategy.NumberGeneratorStrategy

class Race(
    private val cars: Cars,
    val strategy: NumberGeneratorStrategy,
) {
    fun raceOneRound(): Scores {
        return cars.move(strategy)
    }
}
