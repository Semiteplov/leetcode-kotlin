package problems.easy

// https://leetcode.com/problems/climbing-stairs/
fun climbStairs(n: Int): Int {
    var prev = 0
    var current = 1
    for (i in 1..n) {
        val next = prev + current
        prev = current
        current = next
    }
    return current
}