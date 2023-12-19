package course.hashing

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class LargestUniqueNumberKtTest {

    @Test
    fun largestUniqueNumber() {
        assertEquals(8, largestUniqueNumber(intArrayOf(5, 7, 3, 9, 4, 9, 8, 3, 1)))
        assertEquals(-1, largestUniqueNumber(intArrayOf(9, 9, 8, 8)))
    }
}