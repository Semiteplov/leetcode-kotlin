package problems.easy.hashing

// https://leetcode.com/problems/unique-number-of-occurrences slow implementation
fun uniqueOccurrences(arr: IntArray): Boolean {
    val map = arr.groupBy { it }.mapValues { it.value.count() }
    return map.values.toSet().size == map.values.size
}

fun uniqueOccurrences2(arr: IntArray): Boolean {
    val map = mutableMapOf<Int, Int>()
    for (n in arr) {
        map[n] = map.getOrDefault(n, 0) + 1
    }
    return map.values.toSet().size == map.values.size
}