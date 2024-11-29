package racingcar.domain

data class CarName(val name: String) {
    init {
        require(name.length <=5) { "자동차 이름은 5자리를 초과 할수 없습니다"}
    }
}