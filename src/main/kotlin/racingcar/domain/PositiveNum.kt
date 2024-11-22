package racingcar.domain

class PositiveNum(inputNumber: String) {
    val number: Int

    init {
        require(inputNumber.isNotBlank()) { "자동차 수와 시도 횟수는 공백 일 수 없습니다" }
        require(inputNumber.toInt() > 0) { "자동차 수와 시도 횟수는 는 양수만 입력 가능합니다" }
        number = inputNumber.toInt()
    }
}
