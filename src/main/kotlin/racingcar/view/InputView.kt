package racingcar.view

import racingcar.domain.PositiveNumber
import racingcar.dto.GameCondition


object InputView {
    fun getUserInput(): GameCondition {
        println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
        val carNamesString = readln()
        println("시도할 횟수는 몇 회 인가요?")
        val gameRound = readln()
        return GameCondition(carNamesString, PositiveNumber(gameRound))
//        return GameCondition(PositiveNumber(carNamesString), PositiveNumber(gameRound), carNames)
    }
}
