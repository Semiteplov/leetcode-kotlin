package problems.easy

// https://leetcode.com/problems/set-mismatch/
fun findErrorNums(nums: IntArray): IntArray {
    val freqMap = HashMap<Int, Int>()
    val n = nums.size
    var duplicated = -1
    var missing = -1

    // Count the frequency of each number in nums
    for (num in nums) {
        freqMap[num] = freqMap.getOrDefault(num, 0) + 1
    }

    // Check for the duplicated and the missing number
    for (i in 1..n) {
        val freq = freqMap.getOrDefault(i, 0)
        if (freq == 2) {
            duplicated = i
        } else if (freq == 0) {
            missing = i
        }

        // If both duplicated and missing are found, break the loop
        if (duplicated != -1 && missing != -1) {
            break
        }
    }

    return intArrayOf(duplicated, missing)
}