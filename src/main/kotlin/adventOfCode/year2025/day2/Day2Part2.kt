package adventOfCode.year2025.day2

fun main() {
    println("Day 2 Part 2 - Advent of Code 2025")
    
    val input = readInputPart2()
    val ranges = parseRangesPart2(input.first())
    val totalInvalidIds = ranges.sumOf { sumInvalidIdsPart2(it) }
    
    println("Total sum of invalid IDs: $totalInvalidIds")
}

fun parseRangesPart2(input: String): List<Pair<Long, Long>> =
    input.split(",").map { range ->
        val (start, end) = range.trim().split("-").map { it.toLong() }
        start to end
    }

fun sumInvalidIdsPart2(range: Pair<Long, Long>): Long =
    (range.first..range.second).filter { isInvalidIdPart2(it) }.sum()

fun isInvalidIdPart2(id: Long): Boolean {
    val idStr = id.toString()
    val len = idStr.length
    
    // Try all possible pattern lengths (from 1 to len/2)
    for (patternLen in 1..len / 2) {
        if (len % patternLen == 0) {
            val pattern = idStr.substring(0, patternLen)
            val repeated = pattern.repeat(len / patternLen)
            if (repeated == idStr) {
                return true
            }
        }
    }
    
    return false
}

fun readInputPart2(): List<String> {
    return object {}.javaClass.getResourceAsStream("/adventOfCode/year2025/day2/input.txt")
        ?.bufferedReader()
        ?.readLines()
        ?: emptyList()
}
