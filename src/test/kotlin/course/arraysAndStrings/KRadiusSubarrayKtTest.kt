package course.arraysAndStrings

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class KRadiusSubarrayKtTest {

    @Test
    fun getAverages() {
        assertEquals(intArrayOf(-1, -1, -1, 5, 4, 4, -1, -1, -1).contentToString(), getAverages(intArrayOf(7, 4, 3, 9, 1, 8, 5, 2, 6), 3).contentToString())
        assertEquals(intArrayOf(100000).contentToString(), getAverages(intArrayOf(100000), 0).contentToString())
        assertEquals(intArrayOf(-1).contentToString(), getAverages(intArrayOf(8), 100000).contentToString()) }
}