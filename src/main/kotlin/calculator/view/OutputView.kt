package calculator.view

import calculator.Operand

class OutputView {
    companion object {
        fun printResult(result: Operand) {
            println("계산 결과 : " + result.number)
        }
    }
}