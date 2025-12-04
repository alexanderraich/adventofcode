package adventOfCode.year2025.day4

fun main() {
    println("Day 4 Part 2 - Advent of Code 2025")
    
    val input = readInputPart2()
    val totalRemoved = removeAllAccessibleRolls(input)
    
    println("Total rolls removed: $totalRemoved")
}

fun removeAllAccessibleRolls(grid: List<String>): Int {
    val mutableGrid = grid.map { it.toCharArray() }.toMutableList()
    var totalRemoved = 0
    
    while (true) {
        val accessible = findAccessibleRolls(mutableGrid)
        if (accessible.isEmpty()) break
        
        // Remove all accessible rolls
        for ((row, col) in accessible) {
            mutableGrid[row][col] = '.'
        }
        
        totalRemoved += accessible.size
    }
    
    return totalRemoved
}

fun findAccessibleRolls(grid: List<CharArray>): List<Pair<Int, Int>> {
    val accessible = mutableListOf<Pair<Int, Int>>()
    
    for (row in grid.indices) {
        for (col in grid[row].indices) {
            if (grid[row][col] == '@' && isAccessiblePart2(grid, row, col)) {
                accessible.add(row to col)
            }
        }
    }
    
    return accessible
}

fun isAccessiblePart2(grid: List<CharArray>, row: Int, col: Int): Boolean {
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

fun readInputPart2(): List<String> {
    return object {}.javaClass.getResourceAsStream("/adventOfCode/year2025/day4/input.txt")
        ?.bufferedReader()
        ?.readLines()
        ?: emptyList()
}
