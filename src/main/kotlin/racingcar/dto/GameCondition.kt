package racingcar.dto

import racingcar.domain.CarName
import racingcar.domain.CarNames
import racingcar.domain.PositiveNumber

class GameCondition(
    names: String,
    round: String,
) {
    val carNames: CarNames
    val gameRound: PositiveNumber

    init {
        carNames = splitCarName(names)
        gameRound = PositiveNumber(round)
    }

    private fun splitCarName(names: String): CarNames {
        val carNameList = names.split(DELIMITER)
        val names = ArrayList<CarName>()
        repeat(carNameList.size) {
            names.add(CarName(carNameList[it]))
        }
        return CarNames(names)
    }

    companion object {
        private const val DELIMITER = ","
    }
}
