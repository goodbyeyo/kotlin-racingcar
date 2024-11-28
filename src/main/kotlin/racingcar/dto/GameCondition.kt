package racingcar.dto

import racingcar.domain.PositiveNumber

data class GameCondition(
    val carNumber: PositiveNumber,
    val gameRound: PositiveNumber,
)
