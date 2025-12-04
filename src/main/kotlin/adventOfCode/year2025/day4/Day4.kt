package adventOfCode.year2025.day4

fun main() {
    println("Day 4 - Advent of Code 2025")
    
    val input = readInput()
    val accessibleCount = countAccessibleRolls(input)
    
    println("Accessible rolls: $accessibleCount")
}

fun countAccessibleRolls(grid: List<String>): Int {
    var count = 0
    
    for (row in grid.indices) {
        for (col in grid[row].indices) {
            if (grid[row][col] == '@' && isAccessible(grid, row, col)) {
                count++
            }
        }
    }
    
    return count
}

fun isAccessible(grid: List<String>, row: Int, col: Int): Boolean {
    val directions = listOf(
        -1 to -1, -1 to 0, -1 to 1,
        0 to -1,           0 to 1,
        1 to -1,  1 to 0,  1 to 1
    )
    
    var adjacentRolls = 0
    
    for ((dr, dc) in directions) {
        val newRow = row + dr
        val newCol = col + dc
        
        if (newRow in grid.indices && newCol in grid[newRow].indices) {
            if (grid[newRow][newCol] == '@') {
                adjacentRolls++
            }
        }
    }
    
    return adjacentRolls < 4
}

fun readInput(): List<String> {
    return object {}.javaClass.getResourceAsStream("/adventOfCode/year2025/day4/input.txt")
        ?.bufferedReader()
        ?.readLines()
        ?: emptyList()
}
