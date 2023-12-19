package course.arraysAndStrings

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class RunningSumKtTest {

    @Test
    fun runningSum() {
        assertEquals(intArrayOf(1,3,6,10), runningSum(intArrayOf(1,2,3,4)))
        assertEquals(intArrayOf(1,2,3,4,5), runningSum(intArrayOf(1,1,1,1,1)))
        assertEquals(intArrayOf(3,4,6,16,17), runningSum(intArrayOf(3,1,2,10,1)))
    }
}