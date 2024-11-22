package calculator

class Calculator(
    private val expression: Expression,
) {
    fun calculate(): Operand {
        var result = Operand(expression.operands.numbers[0].number).number
        val numbers = expression.operands.numbers
        val operators = expression.symbols.operators
        for (i in 0 until numbers.size - 1) {
            result = Operator.of(operators[i]).operate(result, numbers[i + 1].number)
        }
        return Operand(result)
    }
}
