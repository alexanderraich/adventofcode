package adventOfCode.year2025.day3

fun main() {
    println("Day 3 Part 2 - Advent of Code 2025")
    
    val input = readInputPart2()
    val totalJoltage = input.sumOf { findMaxJoltagePart2(it, 12) }
    
    println("Total output joltage: $totalJoltage")
}

fun findMaxJoltagePart2(bank: String, count: Int): Long {
    // Greedy approach: for each position in result, pick the largest digit
    // from remaining candidates that leaves enough digits for remaining positions
    
    val result = StringBuilder()
    var startIndex = 0
    
    repeat(count) { position ->
        val remainingNeeded = count - position - 1
        val searchEnd = bank.length - remainingNeeded
        
        // Find the largest digit in the valid range
        var maxDigit = '0'
        var maxIndex = startIndex
        
        for (i in startIndex until searchEnd) {
            if (bank[i] > maxDigit) {
                maxDigit = bank[i]
                maxIndex = i
            }
        }
        
        result.append(maxDigit)
        startIndex = maxIndex + 1
    }
    
    return result.toString().toLong()
}

fun readInputPart2(): List<String> {
    return object {}.javaClass.getResourceAsStream("/adventOfCode/year2025/day3/input.txt")
        ?.bufferedReader()
        ?.readLines()
        ?: emptyList()
}
