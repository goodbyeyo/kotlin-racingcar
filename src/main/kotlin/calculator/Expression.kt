package calculator

import calculator.view.InputView

data class Expression(val inputView: InputView) {
    val operands: Operands
    val symbols: Symbols

    init {
        isValidException(inputView)
        val formulas = inputView.intput.text.split(DELIMITER)
        val delimitedString = groupByFormulas(formulas)
        if (delimitedString[true].isNullOrEmpty() || delimitedString[false].isNullOrEmpty()) {
            throw IllegalArgumentException(WRONG_EXPRESSION)
        }
        operands = Operands(delimitedString[true]!!.map { Operand(it.toInt()) })
        symbols = Symbols(delimitedString[false]!!)
        validateOperandCount()
    }

    private fun isValidException(inputView: InputView) {
        if (!PATTERN.toRegex().matches(inputView.intput.text.trim())) {
            throw IllegalArgumentException(WRONG_EXPRESSION)
        }
    }

    private fun validateOperandCount() {
        if (operands.numbers.size != symbols.operators.size + 1) {
            throw IllegalArgumentException(WRONG_)
        }
    }

    private fun groupByFormulas(formulas: List<String>): Map<Boolean, List<String>> {
        return formulas.groupBy { (it.toIntOrNull() != null) }
    }

    companion object {
        private const val DELIMITER = " "
        private const val WRONG_EXPRESSION = "계산할 수식이 올바르지 않습니다"
        private const val WRONG_ = "계산할 수식이 이상해요"
        private const val PATTERN = """^(\d+(\.\d+)?(\s[+\-*/]\s\d+(\.\d+)?)*?)$"""
    }
}
