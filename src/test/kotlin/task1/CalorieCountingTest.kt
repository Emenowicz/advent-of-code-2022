package task1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

private const val TEST_INPUT_TXT = "/task1/testInput"

internal class CalorieCountingTest {
    private val calorieCounting: CalorieCounting = CalorieCounting()

    @Test
    fun testPart1() {
        //given
        val expectedResult = 24000
        //when
        val result = calorieCounting.calculatePart1(calorieCounting.getInputData(TEST_INPUT_TXT));
        //then
        assertEquals(expectedResult, result)
    }
    @Test
    fun testPart2() {
        //given
        val expectedResult = 45000
        //when
        val result = calorieCounting.calculatePart2(calorieCounting.getInputData(TEST_INPUT_TXT));
        //then
        assertEquals(expectedResult, result)
    }

}
