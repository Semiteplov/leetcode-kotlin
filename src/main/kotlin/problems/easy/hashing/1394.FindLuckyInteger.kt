package problems.easy.hashing

import kotlin.math.max

// https://leetcode.com/problems/find-lucky-integer-in-an-array/
fun findLucky(arr: IntArray): Int {
    val map = mutableMapOf<Int, Int>()
    var res = -1
    for (n in arr) {
        map[n] = map.getOrDefault(n, 0) + 1
    }

    for (i in map) {
        if (i.key == i.value) {
            res = max(res, i.key)
        }
    }

    return res
}