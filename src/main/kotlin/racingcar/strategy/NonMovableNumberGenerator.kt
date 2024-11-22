package racingcar.strategy

class NonMovableNumberGenerator : NumberGeneratorStrategy {
    override fun generateNumber(): Int {
        return NON_MOVABLE_CONDITION
    }

    override fun isMovable(number: Int): Boolean {
        return false
    }

    companion object {
        private const val NON_MOVABLE_CONDITION = 3
    }
}
