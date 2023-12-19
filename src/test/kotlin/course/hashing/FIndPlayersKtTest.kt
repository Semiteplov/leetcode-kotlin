package course.hashing

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class FIndPlayersKtTest {

    @Test
    fun findWinners() {
        assertEquals(
            "[[1,2,10],[4,5,7,8]]", findWinners(
                arrayOf(
                    intArrayOf(1, 3),
                    intArrayOf(2, 3),
                    intArrayOf(3, 6),
                    intArrayOf(5, 6),
                    intArrayOf(5, 7),
                    intArrayOf(4, 5),
                    intArrayOf(4, 8),

                    intArrayOf(4, 9),
                    intArrayOf(10, 4),
                    intArrayOf(10, 9)
                )
            ).toString()
        )
        assertEquals(
            "[[1,2,5,6],[]]", findWinners(
                arrayOf(
                    intArrayOf(2, 3),
                    intArrayOf(1, 3),
                    intArrayOf(5, 4),
                    intArrayOf(6, 4),
                )
            ).toString()
        )
    }
}