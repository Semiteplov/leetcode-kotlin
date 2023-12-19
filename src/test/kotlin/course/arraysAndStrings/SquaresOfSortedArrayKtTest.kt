package course.arraysAndStrings

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SquaresOfSortedArrayKtTest {

    @Test
    fun sortedSquares() {
        assertArrayEquals(intArrayOf(0, 1, 9, 16, 100), sortedSquares(intArrayOf(-4, -1, 0, 3, 10)))
        assertArrayEquals(intArrayOf(4, 9, 9, 49, 121), sortedSquares(intArrayOf(-7, -3, 2, 3, 11)))
    }
}