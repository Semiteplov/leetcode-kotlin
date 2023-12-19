package course.hashing

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PangramKtTest {

    @Test
    fun checkIfPangram() {
        assertTrue(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"))
        assertFalse(checkIfPangram("leetcode"))
    }
}