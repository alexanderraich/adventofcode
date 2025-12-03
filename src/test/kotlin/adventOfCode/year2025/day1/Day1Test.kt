package adventOfCode.year2025.day1

import kotlin.test.Test
import kotlin.test.assertEquals

class Day1Test {
    @Test
    fun testExampleFromProblem() {
        val instructions = listOf(
            "L68", "L30", "R48", "L5", "R60", "L55", "L1", "L99", "R14", "L82"
        )
        val result = countZeroCrossings(instructions)
        assertEquals(3, result, "Expected 3 zero crossings in the example")
    }
}
