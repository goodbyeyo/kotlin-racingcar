package racingcar.dto

import racingcar.domain.CarNames
import racingcar.domain.PositiveNumber

data class GameCondition(
    val carNames: String,
//    val carNumber: PositiveNumber,
    val gameRound: PositiveNumber,
//    val carNames: CarNames,
)
