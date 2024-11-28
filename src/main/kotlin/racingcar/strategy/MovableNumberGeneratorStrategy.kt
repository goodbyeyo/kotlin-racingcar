package racingcar.strategy

class MovableNumberGeneratorStrategy : NumberGeneratorStrategy {
    override fun generateNumber(): Int {
        return MOVABLE_CONDITION
    }

    override fun isMovable(): Boolean {
        return true
    }

    companion object {
        private const val MOVABLE_CONDITION = 4
    }
}
