package adventOfCode.year2025.day1

fun main() {
    println("Day 1 - Advent of Code 2025")
    
    val input = readInput()
    println("Read ${input.size} lines")
}

fun readInput(): List<String> {
    return object {}.javaClass.getResourceAsStream("/adventOfCode/year2025/day1/input.txt")
        ?.bufferedReader()
        ?.readLines()
        ?: emptyList()
}
