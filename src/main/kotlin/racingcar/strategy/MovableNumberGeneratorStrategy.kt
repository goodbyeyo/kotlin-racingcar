package racingcar.strategy

import racingcar.strategy.RandomNumberGeneratorStrategy.Companion.MOVABLE_NUMBER_CONDITION

class MovableNumberGeneratorStrategy : NumberGeneratorStrategy {
    override fun isMovable(): Boolean {
        return MOVABLE_CONDITION >= MOVABLE_NUMBER_CONDITION
    }

    companion object {
        private const val MOVABLE_CONDITION = 4
    }
}
