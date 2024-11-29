package racingcar.domain

import racingcar.dto.GameCondition
import racingcar.strategy.NumberGeneratorStrategy

class RacingCarGame(
    private val gameCondition: GameCondition,
    private val strategy: NumberGeneratorStrategy,
) {
    fun startGame(): List<Scores> {
        val cars = Cars(gameCondition.carNumber)
        val rounds = gameCondition.gameRound.number
        val allRoundScore = ArrayList<Scores>()
        repeat(rounds) {
            val scores = Race(cars, strategy).raceOneRound()
            allRoundScore.add(scores)
        }
        return allRoundScore
    }
}
