package racingcar.view

import racingcar.domain.PositiveNum
import racingcar.dto.UserInput

object InputView {
    fun getUserInput(): UserInput {
        println("자동차 대수는 몇 대 인가요?")
        val carNumber = readln()
        println("시도할 횟수는 몇 회 인가요?")
        val gameRound = readln()
        return UserInput(PositiveNum(carNumber), PositiveNum(gameRound))
    }
}