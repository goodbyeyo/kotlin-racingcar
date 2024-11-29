package racingcar.strategy

class RandomNumberGeneratorStrategy : NumberGeneratorStrategy {

    override fun isMovable(): Boolean {
        return range.random() >= MOVABLE_NUMBER_CONDITION
    }

    companion object {
        private const val RAMDOM_RULE_MAX_NUMBER = 9
        private const val RAMDOM_RULE_MIN_NUMBER = 0
        const val MOVABLE_NUMBER_CONDITION = 4
        val range = (RAMDOM_RULE_MIN_NUMBER..RAMDOM_RULE_MAX_NUMBER)
    }
}
