package course.arraysAndStrings

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MInValSumKtTest {

    @Test
    fun minStartValue() {
        assertEquals(5, minStartValue(intArrayOf(-3, 2, -3, 4, 2)))
        assertEquals(1, minStartValue(intArrayOf(1, 2)))
        assertEquals(5, minStartValue(intArrayOf(1, -2, -3)))
    }
}