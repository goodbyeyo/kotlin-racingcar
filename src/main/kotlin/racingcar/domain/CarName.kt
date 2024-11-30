package racingcar.domain

data class CarName(val name: String) {
    init {
        require(name.length <= MAX_NAME_LENGTH) { "자동차 이름은 $MAX_NAME_LENGTH 자리를 초과 할수 없습니다" }
    }

    companion object {
        private const val MAX_NAME_LENGTH = 5
    }
}
