package calculator

import calculator.view.InputView
import calculator.view.OutputView

fun main() {
    val inputText = InputView.inputExpression()
    val result = Calculator(Expression(UnparsedExpression(inputText))).calculate()
    OutputView.printResult(result)
}
