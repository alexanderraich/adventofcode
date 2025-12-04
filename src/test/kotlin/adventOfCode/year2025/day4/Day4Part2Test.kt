package adventOfCode.year2025.day4

import kotlin.test.Test
import kotlin.test.assertEquals

class Day4Part2Test {
    @Test
    fun testRemoveAllAccessibleRolls() {
        val grid = listOf(
            "..@@.@@@@.",
            "@@@.@.@.@@",
            "@@@@@.@.@@",
            "@.@@@@..@.",
            "@@.@@@@.@@",
            ".@@@@@@@.@",
            ".@.@.@.@@@",
            "@.@@@.@@@@",
            ".@@@@@@@@.",
            "@.@.@@@.@."
        )
        
        val result = removeAllAccessibleRolls(grid)
        assertEquals(43, result, "Should remove 43 rolls total")
    }
}
