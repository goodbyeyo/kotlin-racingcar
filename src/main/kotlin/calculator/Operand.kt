package calculator

@JvmInline
value class Operand(
    val number: Int,
) {
    init {
        require(number >= 0) { "피연산자는 0보다 큰 숫자를 입력해주세요" }
    }
}
