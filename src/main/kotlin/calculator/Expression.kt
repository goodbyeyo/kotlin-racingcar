package calculator

class Expression(unparsedExpression: UnparsedExpression) {
    val operands: Operands
    val symbols: Symbols

    init {
        unparsedExpression.isValidExpression()
        val formulas = unparsedExpression.text.split(DELIMITER)
        val delimitedString = groupByFormulas(formulas)
        val operandStrings = requireNotNull(delimitedString[true]) { WRONG_EXPRESSION }
        val symbolStrings = requireNotNull(delimitedString[false]) { WRONG_EXPRESSION }
        operands = Operands(operandStrings.map { Operand(it.toInt()) })
        symbols = Symbols(symbolStrings)
        validateOperandCount()
    }

    private fun validateOperandCount() {
        if (operands.numbers.size != symbols.operators.size + 1) {
            throw IllegalArgumentException(WRONG_EXPRESSION)
        }
    }

    private fun groupByFormulas(formulas: List<String>): Map<Boolean, List<String>> {
        return formulas.groupBy { (it.toIntOrNull() != null) }
    }

    fun findFirstOperand(): Int {
        return operands.findFirstOperand()
    }

    companion object {
        const val WRONG_EXPRESSION = "계산할 수식이 올바르지 않습니다"
        private const val DELIMITER = " "
    }
}
