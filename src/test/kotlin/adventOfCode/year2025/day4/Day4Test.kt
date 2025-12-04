package adventOfCode.year2025.day4

import kotlin.test.Test
import kotlin.test.assertEquals

class Day4Test {
    @Test
    fun testCountAccessibleRolls() {
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
        
        val result = countAccessibleRolls(grid)
        assertEquals(13, result, "Should find 13 accessible rolls")
    }
}
