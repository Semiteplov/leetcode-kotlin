package problems.medium

import kotlin.math.abs

// https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram
fun minSteps(s: String, t: String): Int {
    val mapS = mutableMapOf<Char, Int>()
    val mapT = mutableMapOf<Char, Int>()

    for (c in s) {
        mapS[c] = mapS.getOrDefault(c, 0) + 1
    }

    var steps = 0
    for (c in t) {
        mapT[c] = mapT.getOrDefault(c, 0) + 1
    }

    for (c in mapS) {
        val sFreq = c.value
        val tFreq = mapT.getOrDefault(c.key, 0)
        if (sFreq > tFreq) {
            steps += sFreq - tFreq
        }
    }

    return steps
}
