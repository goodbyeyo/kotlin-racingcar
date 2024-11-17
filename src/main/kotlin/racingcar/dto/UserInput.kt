package racingcar.dto


class UserInput(carNumber: String, gameRound: String) {
    val carNumber: Int
    val gameRound: Int

    init {
        validateNegativeNumber(carNumber, gameRound)
        this.carNumber = carNumber.toInt()
        this.gameRound = gameRound.toInt()
    }

    companion object {
        private fun validateNegativeNumber(carNumber: String, gameRound: String) {
            require(!(carNumber.toInt() <= 0)) { "자동차 대수는 양수만 입력가능합니다" }
            require(!(gameRound.toInt() <= 0)) { "자동차 시도 횟수는 양수만 입력 가능합니다" }
        }
    }
}