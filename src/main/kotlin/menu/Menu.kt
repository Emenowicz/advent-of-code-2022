package menu

import task0.Problem
import task0.Unknown

class Menu {
    companion object {

        @JvmStatic
        fun menu() {
            printWelcome()
            while (true) {
                printMenu()
                val selection = readLine()
                if (!selection.equals("exit", true)) {
                    val problem: Problem = when (selection?.toInt() ?: 0) {
                        else -> Unknown()
                    }
                    printSolution(problem)
                } else {
                    printGoodbye()
                    return
                }
            }
        }

        private fun printWelcome() {
            println("Welcome to Advent of Code solutions solved by Dawid Michałowicz")
        }

        private fun printMenu() {
            println("Select problem to solve by writing its number:")

            println("Write 'exit' to finish")
        }


        private fun printSolution(problem: Problem) {
            println("Solution: ")
            problem.printSolution()
            println()
        }

        private fun printGoodbye(){
            println("Thanks, bye!")
        }
    }
}
