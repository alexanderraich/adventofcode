package adventOfCode.year2025.day3

import kotlin.test.Test
import kotlin.test.assertEquals

class Day3Test {
    @Test
    fun testFindMaxJoltage() {
        assertEquals(98, findMaxJoltage("987654321111111"), "987654321111111 should produce 98")
        assertEquals(89, findMaxJoltage("811111111111119"), "811111111111119 should produce 89")
        assertEquals(78, findMaxJoltage("234234234234278"), "234234234234278 should produce 78")
        assertEquals(92, findMaxJoltage("818181911112111"), "818181911112111 should produce 92")
    }
    
    @Test
    fun testTotalJoltage() {
        val banks = listOf(
            "987654321111111",
            "811111111111119",
            "234234234234278",
            "818181911112111"
        )
        val total = banks.sumOf { findMaxJoltage(it) }
        assertEquals(357, total, "Total should be 357")
    }
}
