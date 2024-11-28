package racingcar.domain

import racingcar.strategy.NumberGeneratorStrategy

class Race(
    private val cars: Cars,
    val strategy: NumberGeneratorStrategy,
) {
    fun raceOneRound(): Scores {
        val list = ArrayList<Score>()
        for (car in cars.findAllCars()) {
            car.move(strategy)
            list.add(Score(car.point))
        }
        return Scores(list)
    }
}
