package task2

interface Choice {
    val value: Int
    val beatenValue: Int
    fun compareTo(choice: Choice):Int


}
