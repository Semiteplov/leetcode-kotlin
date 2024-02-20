package problems.easy

// https://leetcode.com/problems/rearrange-array-elements-by-sign/
class Solution2149 {
    fun rearrangeArray(nums: IntArray): IntArray {
        var positive = 0
        var negative = 1
        val answer = IntArray(nums.size) { 0 }

        for (i in nums.indices) {
            if (nums[i] > 0) {
                answer[positive] = nums[i]
                positive += 2
            } else {
                answer[negative] = nums[i]
                negative += 2
            }
        }

        return answer
    }
}