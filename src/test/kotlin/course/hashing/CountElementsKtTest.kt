package course.hashing

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class CountElementsKtTest {

    @Test
    fun countElements() {
        assertEquals(2, countElements(intArrayOf(1,2,3)))
        assertEquals(0, countElements(intArrayOf(1,1,3,3,5,5,7,7)))
    }
}