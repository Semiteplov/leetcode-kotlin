package problems.easy.hashing

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class FindLuckyIntegerKtTest {

    @Test
    fun findLucky() {
        assertEquals(2, findLucky(intArrayOf(2,2,3,4)))
    }
}