package adventOfCode.year2025.day2

fun main() {
    println("Day 2 - Advent of Code 2025")
    
    val input = readInput()
    val ranges = parseRanges(input.first())
    val totalInvalidIds = ranges.sumOf { countInvalidIds(it) }
    
    println("Total sum of invalid IDs: $totalInvalidIds")
}

fun parseRanges(input: String): List<Pair<Long, Long>> =
    input.split(",").map { range ->
        val (start, end) = range.trim().split("-").map { it.toLong() }
        start to end
    }

fun countInvalidIds(range: Pair<Long, Long>): Long =
    (range.first..range.second).filter { isInvalidId(it) }.sum()

fun isInvalidId(id: Long): Boolean {
    val idStr = id.toString()
    val len = idStr.length
    
    // Must be even length to be repeated twice
    if (len % 2 != 0) return false
    
    val half = len / 2
    val firstHalf = idStr.substring(0, half)
    val secondHalf = idStr.substring(half)
    
    return firstHalf == secondHalf
}

fun readInput(): List<String> {
    return object {}.javaClass.getResourceAsStream("/adventOfCode/year2025/day2/input.txt")
        ?.bufferedReader()
        ?.readLines()
        ?: emptyList()
}
