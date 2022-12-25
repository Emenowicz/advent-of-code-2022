package task2

import task0.Problem
import kotlin.math.exp

class RockPaperScissors : Problem {
    override fun printSolution() {
        println("Part 1: " + calculatePart1(getInputData("/task2/input")))
        println("Part 2: " + calculatePart2(getInputData("/task2/input")))
    }

    fun calculatePart1(inputData: List<String>): Int {
        val rounds = convertInputToRounds(inputData)
        var pointsSum = 0
        rounds.forEach { round ->
            run {
                val enemyChoice = round[0]
                val myChoice = round[1]

                if (myChoice != null && enemyChoice != null) {
                    pointsSum += myChoice.compareTo(enemyChoice)
                    pointsSum += myChoice.value
                }
            }
        }
        return pointsSum
    }

    fun calculatePart2(inputData: List<String>): Int {
        val rounds = convertInputToRounds(inputData)
        var pointsSum = 0
        rounds.forEach { round ->
            run {
                val enemyChoice = round[0]
                val expectedOutcome = round[1]

                if (enemyChoice != null && expectedOutcome != null) {
                    pointsSum += when (expectedOutcome.value) {
                        3 -> enemyChoice.beatenValue + 6
                        2 -> enemyChoice.value + 3
                        else -> 6 - enemyChoice.value - enemyChoice.beatenValue
                    }
                }
            }
        }
        return pointsSum
    }

    private fun convertInputToRounds(inputData: List<String>): List<List<Choice?>> {
        return inputData.map { it -> it.split(" ").map { ChoiceFactory.getChoice(it) }.toList() }.toList()
    }
}
