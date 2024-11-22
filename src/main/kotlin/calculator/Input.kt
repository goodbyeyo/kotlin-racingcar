package calculator

class Input(
    val text: String,
) {
    init {
        require(text.isNotEmpty()) { "text should be not empty" }
        require(text.isNotBlank()) { "text should be not blank" }
    }
}
