package adventOfCode.year2025.day1

fun main() {
    println("Day 1 - Advent of Code 2025")
    
    val input = readInput()
    val password = countZeroCrossings(input)
    println("Password: $password")
}

fun countZeroCrossings(instructions: List<String>): Int =
    instructions
        .fold(50 to 0) { state, instruction ->
            processInstruction(state, instruction)
        }
        .second

private fun processInstruction(state: Pair<Int, Int>, instruction: String): Pair<Int, Int> {
    val (position, zeroCount) = state
    val newPosition = calculateNewPosition(position, instruction)
    val newZeroCount = incrementIfZero(zeroCount, newPosition)
    return newPosition to newZeroCount
}

private fun calculateNewPosition(position: Int, instruction: String): Int {
    val amount = parseAmount(instruction)
    val delta = calculateDelta(instruction[0], amount)
    return (position + delta + 100) % 100
}

private fun parseAmount(instruction: String): Int =
    instruction.drop(1).toInt()

private fun calculateDelta(direction: Char, amount: Int): Int =
    when (direction) {
        'L' -> amount
        'R' -> -amount
        else -> 0
    }

private fun incrementIfZero(count: Int, position: Int): Int =
    count + (position == 0).compareTo(false)

fun readInput(): List<String> {
    return object {}.javaClass.getResourceAsStream("/adventOfCode/year2025/day1/input.txt")
        ?.bufferedReader()
        ?.readLines()
        ?: emptyList()
}
