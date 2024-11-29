package racingcar.domain

import racingcar.dto.GameCondition
import racingcar.strategy.NumberGeneratorStrategy

class RacingCarGame(
    private val gameCondition: GameCondition,
    private val strategy: NumberGeneratorStrategy,
) {
    fun startGame(): List<Scores> {
        val carNames = splitCarName()
        val cars = Cars(PositiveNumber(carNames.carNameCount().toString()))
        val rounds = gameCondition.gameRound.number
        val allRoundScore = ArrayList<Scores>()
        repeat(rounds) {
            val scores = Race(cars, strategy).raceOneRound()
            allRoundScore.add(scores)
        }
        return allRoundScore
    }

    private fun splitCarName(): CarNames {
        val carName: String = gameCondition.carNames
        val nameList = carName.split(DELIMITER)
        val names = ArrayList<CarName>()
        nameList.forEach{name ->
            names.add(CarName(name))
        }
        return CarNames(names)
    }

    companion object {
        private const val DELIMITER = ","
    }
}
