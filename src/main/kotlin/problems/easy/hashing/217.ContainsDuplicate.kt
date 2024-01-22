package problems.easy.hashing

// https://leetcode.com/problems/contains-duplicate/
fun containsDuplicate(nums: IntArray): Boolean {
    val set = HashSet<Int>()
    for (n in nums) {
        if (set.contains(n)) {
            return true
        }
        set += n
    }
    return false
}