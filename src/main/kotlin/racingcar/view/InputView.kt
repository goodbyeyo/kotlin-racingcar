package racingcar.view

import racingcar.domain.PositiveNumber
import racingcar.dto.GameCondition

object InputView {
    fun getUserInput(): GameCondition {
        println("자동차 대수는 몇 대 인가요?")
        val carCount = readln()
        println("시도할 횟수는 몇 회 인가요?")
        val gameRound = readln()
        return GameCondition(PositiveNumber(carCount), PositiveNumber(gameRound))
    }
}
