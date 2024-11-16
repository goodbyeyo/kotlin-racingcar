package calculator

class Calculator(
    private val expression: Expression,
) {
    fun calculate(): Operand {
        var result = Operand(expression.operands.numbers[0].number).number
        val numbers = expression.operands.numbers
        val operands = expression.symbols.operators
        for (i in 0 until numbers.size - 1) {
            validateDivisionNumber(operands, i, numbers)
            result = Operator.of(operands[i]).operate(result, numbers[i + 1].number)
        }
        return Operand(result)
    }

    private fun validateDivisionNumber(
        operands: List<String>,
        i: Int,
        numbers: List<Operand>,
    ) {
        if (operands[i] == Operator.DIVISION.symbol && numbers[i + 1].number == 0) {
            throw IllegalArgumentException(CAN_NOT_DIVIDE_ZERO)
        }
    }

    companion object {
        private const val CAN_NOT_DIVIDE_ZERO = "0으로 나눌 수 없습니다"
    }
}
