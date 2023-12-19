package course.hashing

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class JewelsAndStonesKtTest {

    @Test
    fun numJewelsInStones() {
        assertEquals(3, numJewelsInStones("aA", "aAAbbbb"))
        assertEquals(0, numJewelsInStones("z", "ZZ"))
    }
}