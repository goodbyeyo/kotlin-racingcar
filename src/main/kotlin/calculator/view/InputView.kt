package calculator.view

import calculator.Input

class InputView(
    val intput: Input,
) {
    companion object {
        const val PROGRAM_END_TEXT = "exit"

        fun inputExpression(): String {
            println("계산할 수식을 입력하세요 (예) 5 + 10 * 9, 종료를 원하면 exit 입력하세요")
            return readln()
        }
    }
}
