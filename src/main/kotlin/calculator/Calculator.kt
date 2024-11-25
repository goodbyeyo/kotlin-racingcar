package calculator

class Calculator(
    private val expression: Expression,
) {
    fun calculate(): Operand {
        var result = Operand(expression.findFirstOperand()).number
        val numbers = expression.operands.numbers
        val operators = expression.symbols.operators
        operators.forEachIndexed { index, operator ->
            result = Operator.of(operator).operate(result, numbers[index + 1].number)
        }
        return Operand(result)
    }
}
