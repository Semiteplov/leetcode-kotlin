package course.arraysAndStrings

import kotlin.math.absoluteValue

/*
    Given an integer array nums sorted in non-decreasing order,
    return an array of the squares of each number sorted in non-decreasing order.

    Constraints:
        1 <= nums.length <= 104
        -104 <= nums[i] <= 104
        nums is sorted in non-decreasing order.

    Follow up: Squaring each element and sorting the new array is very trivial,
    could you find an O(n) solution using a different approach?
 */
fun sortedSquares(nums: IntArray): IntArray {
    var left = 0
    var right = nums.size - 1
    val result = IntArray(nums.size)

    while (left <= right) {
        if (nums[left].absoluteValue > nums[right].absoluteValue) {
            result[right - left] = nums[left] * nums[left]
            left++
        } else {
            result[right - left] = nums[right] * nums[right]
            right--
        }
    }
    return result
}
