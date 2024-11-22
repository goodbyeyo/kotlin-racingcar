package racingcar.strategy

interface NumberGeneratorStrategy {
    fun generateNumber(): Int

    fun isMovable(number: Int): Boolean
}
