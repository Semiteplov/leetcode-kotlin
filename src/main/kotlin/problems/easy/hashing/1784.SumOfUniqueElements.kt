package problems.easy.hashing

fun sumOfUnique(nums: IntArray): Int {
    val map = mutableMapOf<Int, Int>()
    for (n in nums) {
        map[n] = map.getOrDefault(n, 0) + 1
    }
    var sum = 0
    map.forEach { if (it.value == 1) sum += it.key }
    return sum
}
