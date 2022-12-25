package task2

class Rock: Choice {
    override val value: Int
        get() = 1
    override val beatenValue: Int
        get() = 2

    override fun compareTo(choice: Choice): Int {
        return when (choice) {
            is Scissors -> 6
            is Rock -> 3
            is Paper -> 0
            else -> 0
        }
    }
}
