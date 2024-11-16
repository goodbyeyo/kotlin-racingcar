package calculator

enum class Operator(
    val symbol: String,
    val operate: (Int, Int) -> Int) {

    ADDITION("+", { a, b -> a + b}),
    SUBTRACTION("-", { a, b -> a- b }),
    MULTIPLY("*", { a, b -> a * b }),
    DIVISION("/", { a, b -> a / b });

    companion object {
        private const val INCORRECT_OPERATOR = "올바른 사칙연산 기호가 아닙니다"
        fun of(symbol: String): Operator = entries.firstOrNull { it.symbol == symbol }
            ?: throw IllegalArgumentException(INCORRECT_OPERATOR)
    }
}