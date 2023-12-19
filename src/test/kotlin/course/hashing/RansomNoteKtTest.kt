package course.hashing

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class RansomNoteKtTest {

    @Test
    fun canConstruct() {
        assertFalse(canConstruct("a", "b"))
        assertFalse(canConstruct("aa", "ab"))
        assertTrue(canConstruct("aa", "aab"))
    }
}