package adventOfCode.year2025.day3

fun main() {
    println("Day 3 - Advent of Code 2025")
    
    val input = readInput()
    val totalJoltage = input.sumOf { findMaxJoltage(it) }
    
    println("Total output joltage: $totalJoltage")
}

fun findMaxJoltage(bank: String): Int {
    var maxJoltage = 0
    
    // Try all pairs of positions
    for (i in bank.indices) {
        for (j in i + 1 until bank.length) {
            val joltage = "${bank[i]}${bank[j]}".toInt()
            maxJoltage = maxOf(maxJoltage, joltage)
        }
    }
    
    return maxJoltage
}

fun readInput(): List<String> {
    return object {}.javaClass.getResourceAsStream("/adventOfCode/year2025/day3/input.txt")
        ?.bufferedReader()
        ?.readLines()
        ?: emptyList()
}
