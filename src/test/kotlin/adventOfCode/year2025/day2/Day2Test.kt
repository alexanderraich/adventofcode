package adventOfCode.year2025.day2

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Day2Test {
    @Test
    fun testIsInvalidId() {
        assertTrue(isInvalidId(11), "11 should be invalid (1 repeated twice)")
        assertTrue(isInvalidId(22), "22 should be invalid (2 repeated twice)")
        assertTrue(isInvalidId(99), "99 should be invalid (9 repeated twice)")
        assertTrue(isInvalidId(1010), "1010 should be invalid (10 repeated twice)")
        assertTrue(isInvalidId(6464), "6464 should be invalid (64 repeated twice)")
        assertTrue(isInvalidId(123123), "123123 should be invalid (123 repeated twice)")
        assertTrue(isInvalidId(1188511885), "1188511885 should be invalid")
        assertTrue(isInvalidId(222222), "222222 should be invalid (222 repeated twice)")
        assertTrue(isInvalidId(446446), "446446 should be invalid")
        assertTrue(isInvalidId(38593859), "38593859 should be invalid")
        
        assertFalse(isInvalidId(101), "101 should be valid")
        assertFalse(isInvalidId(12), "12 should be valid")
        assertFalse(isInvalidId(100), "100 should be valid")
    }
    
    @Test
    fun testCountInvalidIds() {
        assertEquals(2, countInvalidIds(11L to 22L), "11-22 should have 2 invalid IDs (11, 22)")
        assertEquals(1, countInvalidIds(95L to 115L), "95-115 should have 1 invalid ID (99)")
        assertEquals(1, countInvalidIds(998L to 1012L), "998-1012 should have 1 invalid ID (1010)")
        assertEquals(1, countInvalidIds(1188511880L to 1188511890L), "1188511880-1188511890 should have 1 invalid ID (1188511885)")
        assertEquals(1, countInvalidIds(222220L to 222224L), "222220-222224 should have 1 invalid ID (222222)")
        assertEquals(0, countInvalidIds(1698522L to 1698528L), "1698522-1698528 should have 0 invalid IDs")
        assertEquals(1, countInvalidIds(446443L to 446449L), "446443-446449 should have 1 invalid ID (446446)")
        assertEquals(1, countInvalidIds(38593856L to 38593862L), "38593856-38593862 should have 1 invalid ID (38593859)")
    }
}
