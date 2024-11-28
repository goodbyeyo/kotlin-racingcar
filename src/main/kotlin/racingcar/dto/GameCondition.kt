package racingcar.dto

import racingcar.domain.PositiveNumber

data class UserInput(
    val carNumber: PositiveNumber,
    val gameRound: PositiveNumber,
)
