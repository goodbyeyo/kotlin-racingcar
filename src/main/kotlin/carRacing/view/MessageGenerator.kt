package carRacing.view

import carRacing.enum.ErrorCode
import carRacing.enum.Message

class MessageGenerator {
    fun getErrorMessage(errorCode: ErrorCode, vararg variables: String): String = formatMessage(errorCode.message, *variables)

    fun getMessage(message: Message, vararg variables: String): String = formatMessage(message.message, *variables)

    private fun getVariableCount(message: String): Int = VARIABLE_PATTERN.findAll(message).count()

    private fun formatMessage(message: String, vararg variables: String): String {
        var formattedMessage = message

        if (getVariableCount(message) != variables.size) {
            throw IllegalArgumentException(getErrorMessage(ErrorCode.MISMATCHED_VARIABLE_COUNT))
        }

        variables.forEachIndexed { idx, variable -> formattedMessage = formattedMessage.replace("[$idx]", variable) }

        return formattedMessage
    }

    companion object {
        val VARIABLE_PATTERN: Regex = Regex("\\[\\d+\\]")
    }
}
