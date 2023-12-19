package course.arraysAndStrings

import kotlin.math.max

/**
 * Given a binary array nums and an integer k,
 * return the maximum number of consecutive 1's in the array
 * if you can flip at most k 0's.
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
 * Output: 6
 * Explanation: [1,1,1,0,0,1,1,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 *
 * Example 2:
 *
 * Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
 * Output: 10
 * Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * nums[i] is either 0 or 1.
 * 0 <= k <= nums.length
 */
fun longestOnes(nums: IntArray, k: Int): Int {
    // var ans = 0
    if(nums.isEmpty()){
        return 0
    }
    var left = 0
    var zeroes = 0 // var zerosRemaining = k

    for (right in nums.indices) {
        if (nums[right] == 0) {
            zeroes++
        }
        if (zeroes > k) {
            if (nums[left] == 0) {
                zeroes--
            }
            left++
        }
        // ans = max(right - left + 1, ans)
    }

    return nums.size - left
}