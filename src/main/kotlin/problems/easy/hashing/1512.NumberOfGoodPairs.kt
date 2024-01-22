package problems.easy.hashing

// https://leetcode.com/problems/number-of-good-pairs/
fun numIdenticalPairs(nums: IntArray): Int {
    val map = mutableMapOf<Int, Int>()
    for (n in nums) {
        map[n] = map.getOrDefault(n, 0) + 1
    }
    var res = 0
    for (v in map.values) {
        res += v * (v - 1) / 2
    }

    return res
}