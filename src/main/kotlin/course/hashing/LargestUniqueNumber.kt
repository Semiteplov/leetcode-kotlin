package course.hashing

import java.util.HashMap
import kotlin.math.max

/**
 * https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/705/hashing/4662/
 *
 * Given an integer array nums, return the largest integer that only occurs once. If no integer occurs once, return -1.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,7,3,9,4,9,8,3,1]
 * Output: 8
 * Explanation: The maximum integer in the array is 9 but it is repeated. The number 8 occurs only once, so it is the answer.
 * Example 2:
 *
 * Input: nums = [9,9,8,8]
 * Output: -1
 * Explanation: There is no number that occurs only once.
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 2000
 * 0 <= nums[i] <= 1000
 */
fun largestUniqueNumber(nums: IntArray): Int {
    val map = HashMap<Int,Int>()
    for (n in nums) {
        map[n] = map.getOrDefault(n, 0) + 1
    }
    var ans = -1
    for (entry in map.entries) {
        if (entry.value == 1) {
            ans = max(ans, entry.key)
        }
    }
    return ans
}