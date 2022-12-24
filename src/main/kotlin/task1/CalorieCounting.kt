package task1

import task0.Problem

class CalorieCounting : Problem {
    override fun printSolution() {
        println("Part 1: " + calculatePart1(getInputData("/task1/input")))
        println("Part 2: " + calculatePart2(getInputData("/task1/input")))
    }

    fun calculatePart1(inputData: List<String>): Int {
        val caloriesMap = calculateCaloriesMap(inputData)
        return caloriesMap.entries.maxBy { it.value }.value
    }

    fun calculatePart2(inputData: List<String>): Int {
        val caloriesMap = calculateCaloriesMap(inputData)
        return caloriesMap.entries.sortedBy { it.value }.reversed().take(3).sumOf { it -> it.value }
    }

    private fun calculateCaloriesMap(data: List<String>): MutableMap<Int, Int> {
        val caloriesMap = mutableMapOf<Int, Int>()
        var elfNumber = 1
        var currentCaloriesSum = 0
        data.forEach() { value ->
            if (value.isNotBlank()) {
                currentCaloriesSum += value.toInt()
            } else {
                caloriesMap[elfNumber] = currentCaloriesSum
                elfNumber++
                currentCaloriesSum = 0
            }
        }
        caloriesMap[elfNumber] = currentCaloriesSum
        return caloriesMap
    }
}
