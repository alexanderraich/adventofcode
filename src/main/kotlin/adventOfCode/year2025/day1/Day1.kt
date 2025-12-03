package adventOfCode.year2025.day1

fun main() {
    println("Day 1 - Advent of Code 2025")
    
    val input = readInput()
    val password = countZeroCrossings(input)
    println("Password: $password")
}

fun countZeroCrossings(instructions: List<String>): Int {
    var position = 50
    var zeroCount = 0
    
    for (instruction in instructions) {
        val direction = instruction[0]
        val amount = instruction.substring(1).toInt()
        
        position = when (direction) {
            'L' -> (position + amount) % 100
            'R' -> (position - amount + 100) % 100
            else -> position
        }
        
        if (position == 0) {
            zeroCount++
        }
    }
    
    return zeroCount
}

fun readInput(): List<String> {
    return object {}.javaClass.getResourceAsStream("/adventOfCode/year2025/day1/input.txt")
        ?.bufferedReader()
        ?.readLines()
        ?: emptyList()
}
