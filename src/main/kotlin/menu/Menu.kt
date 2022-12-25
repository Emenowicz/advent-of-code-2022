package menu

import task0.Problem
import task0.Unknown
import task1.CalorieCounting
import task2.RockPaperScissors

class Menu {
    companion object {

        @JvmStatic
        fun menu() {
            printWelcome()
            while (true) {
                printMenu()
                val selection = readlnOrNull()
                if (!selection.isNullOrBlank()) {
                    if (!"exit".equals(selection, true)) {
                        val problem: Problem = when (selection?.toInt() ?: 0) {
                            1 -> CalorieCounting()
                            2 -> RockPaperScissors()
                            else -> Unknown()
                        }
                        printSolution(problem)
                    } else {
                        printGoodbye()
                        return
                    }
                }
            }
        }

        private fun printWelcome() {
            println("Welcome to Advent of Code solutions solved by Dawid Michałowicz")
        }

        private fun printMenu() {
            println("Select problem to solve by writing its number:")
            println("1. CalorieCounting")
            println("2. RockPaperScissors")
            println("Write 'exit' to finish")
        }


        private fun printSolution(problem: Problem) {
            println("Solution: ")
            problem.printSolution()
            println()
        }

        private fun printGoodbye() {
            println("Thanks, bye!")
        }
    }
}
