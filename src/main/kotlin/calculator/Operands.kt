package calculator

data class Operands(
    val numbers: List<Operand>,
) {
    fun findFirstOperand(): Int {
        return numbers[0].number
    }
}
