package task2

class Paper : Choice {
    override val value: Int
        get() = 2
    override val beatenValue: Int
        get() = 3

    override fun compareTo(choice: Choice): Int {
        return when (choice) {
            is Rock -> 6
            is Paper -> 3
            is Scissors -> 0
            else -> 0
        }
    }

}
