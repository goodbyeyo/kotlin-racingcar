package racingcar.dto

import racingcar.domain.PositiveNum


class UserInput(
    val carNumber: PositiveNum,
    val gameRound: PositiveNum
)