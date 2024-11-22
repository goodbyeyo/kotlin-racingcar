package racingcar

import racingcar.domain.RacingCarGame
import racingcar.strategy.RandomNumberGeneratorStrategy
import racingcar.view.InputView
import racingcar.view.ResultView

class RacingCarApplication

fun main() {
    val userInput = InputView.getUserInput()
    val racingCarGame = RacingCarGame(userInput, RandomNumberGeneratorStrategy())
    val allScore = racingCarGame.startGame()
    ResultView.printResult(allScore)
}
