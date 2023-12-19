package course.hashing

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MissingNumberKtTest {

    @Test
    fun missingNumber() {
        assertEquals(2, missingNumber(intArrayOf(3, 0, 1)))
        assertEquals(2, missingNumber(intArrayOf(0, 1)))
        assertEquals(8, missingNumber(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)))
    }
}