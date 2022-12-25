package task2

class ChoiceFactory {
    companion object {
        fun getChoice(letter: String): Choice? {
            return when (letter) {
                "A", "X" -> Rock()
                "B", "Y" -> Paper()
                "C", "Z" -> Scissors()
                else -> null
            }
        }
    }
}
