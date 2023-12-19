package course.hashing

/**
 * https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/705/hashing/4664/
 *
 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
 *
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 *
 *
 *
 * Example 1:
 *
 * Input: jewels = "aA", stones = "aAAbbbb"
 * Output: 3
 * Example 2:
 *
 * Input: jewels = "z", stones = "ZZ"
 * Output: 0
 *
 *
 * Constraints:
 *
 * 1 <= jewels.length, stones.length <= 50
 * jewels and stones consist of only English letters.
 * All the characters of jewels are unique.
 */
fun numJewelsInStones(jewels: String, stones: String): Int {
    var res = 0
    for (s in stones) {
        if (jewels.contains(s)) res++
    }
    return res
}

fun numJewelsInStones2(jewels: String, stones: String): Int {
    return stones.count { jewels.contains(it) }
}