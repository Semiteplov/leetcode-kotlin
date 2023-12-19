package course.hashing

import java.util.HashMap

fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val map = HashMap<Char, Int>()
    for (s in magazine) {
        if (!map.containsKey(s)) {
            map[s] = 0
        }
        map[s] = map[s]!! + 1
    }

    for (s in ransomNote) {
        if (!map.containsKey(s)) return false
        if (map[s] == 0) return false
        map[s] = map[s]!! - 1
    }
    return true
}

fun canConstruct2(ransomNote: String, magazine: String): Boolean {
    val hashMap = HashMap<Char, Int>()

    for (char in magazine) {
        val currentCount = hashMap.getOrDefault(char, 0)
        hashMap[char] = currentCount + 1
    }

    for (char in ransomNote) {
        val currentCount = hashMap.getOrDefault(char, 0)

        if (currentCount == 0) return false

        hashMap[char] = currentCount - 1
    }

    return true
}