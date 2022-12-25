package task2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

private const val TEST_INPUT_TXT = "/task2/testInput"

class RockPaperScissorsTest{
    private val rockPaperScissors: RockPaperScissors = RockPaperScissors()

    @Test
    fun testPart1() {
        //given
        val expectedResult = 15
        //when
        val result = rockPaperScissors.calculatePart1(rockPaperScissors.getInputData(TEST_INPUT_TXT));
        //then
        assertEquals(expectedResult, result)
    }

    @Test
    fun testPart2() {
        //given
        val expectedResult = 12
        //when
        val result = rockPaperScissors.calculatePart2(rockPaperScissors.getInputData(TEST_INPUT_TXT));
        //then
        assertEquals(expectedResult, result)
    }
}
