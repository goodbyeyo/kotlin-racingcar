package calculator

data class Operand(
    val number: Int,
) {
    init {
        if (this.number < 0) {
            throw IllegalArgumentException(MUST_NE_POSITIVE_NUMBER)
        }
    }

    companion object {
        private const val MUST_NE_POSITIVE_NUMBER = "피연산자는 0보다 큰 숫자를 입력해주세요"
    }
}
