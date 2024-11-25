package calculator

class UnparsedExpression(
    val text: String,
) {
    init {
        require(text.isNotEmpty()) { "text should be not empty" }
        require(text.isNotBlank()) { "text should be not blank" }
    }

    fun isValidExpression() {
        if (!PATTERN.toRegex().matches(text.trim())) {
            throw IllegalArgumentException(Expression.WRONG_EXPRESSION)
        }
    }

    companion object {
        private const val PATTERN = """^(\d+(\.\d+)?(\s[+\-*/]\s\d+(\.\d+)?)*?)$"""
    }
}
