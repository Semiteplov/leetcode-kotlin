package course.arraysAndStrings

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MaxAverageSubarrayKtTest {

    @Test
    fun findMaxAverage() {
        assertEquals(12.7500, findMaxAverage(intArrayOf(1,12,-5,-6,50,3), 4))
        assertEquals(5.00000, findMaxAverage(intArrayOf(5), 1))
    }
}