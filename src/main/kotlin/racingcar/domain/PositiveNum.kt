package racingcar.domain

class PositiveNum(number: String) {
    val number: Int

    init {
        require(number.isNotBlank()) { "자동차 수와 시도 횟수는 공백 일 수 없습니다" }
        require(number.toInt() > 0) { "자동차 수와 시도 횟수는 는 양수만 입력 가능합니다" }
        this.number = number.toInt()
    }
}
