package calculator.view

import calculator.Operand

object OutputView {
    fun printResult(result: Operand) {
        println("계산 결과 : " + result.number)
    }
}
