package racingcar.domain

import racingcar.dto.UserInput
import racingcar.strategy.NumberGeneratorStrategy

class RacingCarGame(
    private val userInput: UserInput,
    private val strategy: NumberGeneratorStrategy,
) {
    fun startGame(): List<Scores> {
        val cars = Cars(userInput.carNumber)
        val rounds = userInput.gameRound.number
        val allRoundScore = ArrayList<Scores>()
        for (i in 0 until rounds) {
            val scores = race(cars)
            allRoundScore.add(scores)
        }
        return allRoundScore
    }

    fun race(cars: Cars): Scores {

        val scores = Scores()
        for (car in cars.getCarList()) {
            car.move(strategy)
            scores.addScore(Score(car.findPoint()))
        }

        return scores
    }
}
