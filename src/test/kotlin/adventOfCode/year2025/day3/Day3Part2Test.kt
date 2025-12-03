package adventOfCode.year2025.day3

import kotlin.test.Test
import kotlin.test.assertEquals

class Day3Part2Test {
    @Test
    fun testFindMaxJoltagePart2() {
        val result1 = findMaxJoltagePart2("987654321111111", 12)
        println("987654321111111 -> $result1 (expected 987654321111)")
        assertEquals(987654321111L, result1, "987654321111111 should produce 987654321111")
        
        val result2 = findMaxJoltagePart2("811111111111119", 12)
        println("811111111111119 -> $result2 (expected 811111111119)")
        assertEquals(811111111119L, result2, "811111111111119 should produce 811111111119")
        
        val result3 = findMaxJoltagePart2("234234234234278", 12)
        println("234234234234278 -> $result3 (expected 434234234278)")
        assertEquals(434234234278L, result3, "234234234234278 should produce 434234234278")
        
        val result4 = findMaxJoltagePart2("818181911112111", 12)
        println("818181911112111 -> $result4 (expected 888911112111)")
        assertEquals(888911112111L, result4, "818181911112111 should produce 888911112111")
    }
    
    @Test
    fun testTotalJoltagePart2() {
        val banks = listOf(
            "987654321111111",
            "811111111111119",
            "234234234234278",
            "818181911112111"
        )
        val total = banks.sumOf { findMaxJoltagePart2(it, 12) }
        assertEquals(3121910778619L, total, "Total should be 3121910778619")
    }
}
