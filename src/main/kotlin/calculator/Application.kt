package calculator

import calculator.view.InputView
import calculator.view.OutputView

fun main() {
    val inputText = InputView.inputExpression()
    if (inputText == InputView.PROGRAM_END_TEXT) {
        return
    }
    val result = Calculator(Expression(InputView(inputText))).calculate()
    OutputView.printResult(result)
}
