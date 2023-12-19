package course.hashing

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MaxNumberOfBalloonsKtTest {

    @Test
    fun maxNumberOfBalloons() {
        assertEquals(2, maxNumberOfBalloons("loonbalxballpoon"))
        assertEquals(0, maxNumberOfBalloons("leetcode"))
        assertEquals(1, maxNumberOfBalloons("nlaebolko"))
        assertEquals(0, maxNumberOfBalloons("balon"))
    }
}