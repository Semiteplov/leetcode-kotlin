package course.arraysAndStrings

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import reverseString

class ReverseStringKtTest {

    @Test
    fun reverseString() {
        assertArrayEquals(charArrayOf('o', 'l', 'l', 'e', 'h'), reverseString(charArrayOf('h', 'e', 'l', 'l', 'o')))
        assertArrayEquals(charArrayOf('h', 'a', 'n', 'n', 'a', 'H'), reverseString(charArrayOf('H', 'a', 'n', 'n', 'a', 'h')))
    }
}