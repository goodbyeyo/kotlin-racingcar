package calculator

import calculator.view.InputView

data class Expression(val inputView: InputView) {
    val operands: Operands
    val symbols: Symbols

    init {
        val formulas = inputView.text.split(DELIMITER)
        val delimitedString = groupByFormulas(formulas)
        if (delimitedString[true].isNullOrEmpty() || delimitedString[false].isNullOrEmpty()) {
            throw IllegalArgumentException(WRONG_EXPRESSION)
        }
        operands = Operands(delimitedString[true]!!.map { Operand(it.toInt()) })
        symbols = Symbols(delimitedString[false]!!)
        validate()
    }

    private fun validate() {
        if (operands.numbers.size != symbols.operators.size + 1) {
            throw IllegalArgumentException(INCORRECT_OPERATOR_NUMBER)
        }
    }

    private fun groupByFormulas(formulas: List<String>): Map<Boolean, List<String>> {
        return formulas.groupBy { (it.toIntOrNull() != null) }
    }

    companion object {
        private const val DELIMITER = " "
        private const val WRONG_EXPRESSION = "계산할 수식을 올바르게 입력해주세요"
        private const val INCORRECT_OPERATOR_NUMBER = "피연산자와 연산기호의 수가 올바르지 않습니다"
    }
}
