package racingcar.domain

class PositiveNumber(number: String) {
    val number: Int

    init {
        require(number.isNotEmpty()) { "공백 일 수 없습니다" }
        require(number.toInt() > 0) { "양수만 입력 가능합니다" }
        this.number = number.toInt()
    }
}
