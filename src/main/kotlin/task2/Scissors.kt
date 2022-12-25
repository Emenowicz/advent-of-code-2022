package task2

class Scissors: Choice {
    override val value: Int
        get() = 3
    override val beatenValue: Int
        get() = 1

    override fun compareTo(choice: Choice): Int {
        return when (choice) {
            is Paper -> 6
            is Scissors -> 3
            is Rock -> 0
            else -> 0
        }
    }
}
