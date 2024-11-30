package racingcar.strategy

import racingcar.strategy.RandomNumberGeneratorStrategy.Companion.MOVABLE_NUMBER_CONDITION

class NonMovableNumberGenerator : NumberGeneratorStrategy {
    override fun isMovable(): Boolean {
        return NON_MOVABLE_CONDITION >= MOVABLE_NUMBER_CONDITION
    }

    companion object {
        private const val NON_MOVABLE_CONDITION = 3
    }
}
