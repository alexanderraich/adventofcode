package adventOfCode.year2025.day2

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Day2Part2Test {
    @Test
    fun testIsInvalidIdPart2() {
        // Part 1 examples still work
        assertTrue(isInvalidIdPart2(11), "11 should be invalid (1 repeated twice)")
        assertTrue(isInvalidIdPart2(22), "22 should be invalid (2 repeated twice)")
        assertTrue(isInvalidIdPart2(99), "99 should be invalid (9 repeated twice)")
        assertTrue(isInvalidIdPart2(1010), "1010 should be invalid (10 repeated twice)")
        
        // New Part 2 examples
        assertTrue(isInvalidIdPart2(111), "111 should be invalid (1 repeated three times)")
        assertTrue(isInvalidIdPart2(999), "999 should be invalid (9 repeated three times)")
        assertTrue(isInvalidIdPart2(12341234), "12341234 should be invalid (1234 repeated twice)")
        assertTrue(isInvalidIdPart2(123123123), "123123123 should be invalid (123 repeated three times)")
        assertTrue(isInvalidIdPart2(1212121212), "1212121212 should be invalid (12 repeated five times)")
        assertTrue(isInvalidIdPart2(1111111), "1111111 should be invalid (1 repeated seven times)")
        assertTrue(isInvalidIdPart2(565656), "565656 should be invalid (56 repeated three times)")
        assertTrue(isInvalidIdPart2(824824824), "824824824 should be invalid (824 repeated three times)")
        assertTrue(isInvalidIdPart2(2121212121), "2121212121 should be invalid (21 repeated five times)")
        
        assertFalse(isInvalidIdPart2(101), "101 should be valid")
        assertFalse(isInvalidIdPart2(12), "12 should be valid")
        assertFalse(isInvalidIdPart2(100), "100 should be valid")
    }
    
    @Test
    fun testSumInvalidIdsPart2() {
        assertEquals(33, sumInvalidIdsPart2(11L to 22L), "11-22 should sum to 33 (11+22)")
        assertEquals(210, sumInvalidIdsPart2(95L to 115L), "95-115 should sum to 210 (99+111)")
        assertEquals(2009, sumInvalidIdsPart2(998L to 1012L), "998-1012 should sum to 2009 (999+1010)")
    }
}
