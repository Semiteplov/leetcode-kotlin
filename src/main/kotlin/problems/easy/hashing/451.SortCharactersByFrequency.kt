package problems.easy.hashing

// https://leetcode.com/problems/sort-characters-by-frequency/
fun frequencySort(s: String): String {
    val map = mutableMapOf<Char, Int>()
    for (c in s) {
        map[c] = map.getOrDefault(c, 0) + 1
    }

    var res = ""
    map.entries.sortedByDescending { it.value }.forEach { (k, v) ->
            res += k.toString().repeat(v)
    }
    return res
}