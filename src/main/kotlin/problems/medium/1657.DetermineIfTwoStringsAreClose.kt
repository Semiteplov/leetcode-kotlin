package problems.medium

// https://leetcode.com/problems/determine-if-two-strings-are-close/
fun closeStrings(word1: String, word2: String): Boolean {
    if (word1.length != word2.length) return false

    val map1 = mutableMapOf<Char, Int>()
    val map2 = mutableMapOf<Char, Int>()

    for (char in word1) {
        map1[char] = map1.getOrDefault(char, 0) + 1
    }
    for (char in word2) {
        map2[char] = map2.getOrDefault(char, 0) + 1
    }

    if (map1.keys != map2.keys) return false

    val freq1 = map1.values.sorted()
    val freq2 = map2.values.sorted()

    return freq1 == freq2
}

/**
 * fun closeStrings(word1: String, word2: String): Boolean {
 *         # fail fast
 *         if (word1.length != word2.length) return false
 *
 *         # counting the number of chars in the first word
 *         val wordOneCharsCount = word1.groupBy { it }.mapValues { it.value.size }
 *
 *         # counting the number of chars in the second word
 *         val wordTwoCharsCount = word2.groupBy { it }.mapValues { it.value.size }
 *
 *         # check if the words consist of the same chars
 *         if (wordOneCharsCount.keys != wordTwoCharsCount.keys) return false
 *
 *         # count the number of the number of chars in the first word
 *         val wordOneCountOfCharsCount = wordOneCharsCount.values.groupBy { it }.mapValues { it.value.size }
 *
 *         # count the number of the number of chars in the second word
 *         val wordTwoCountOfCharsCount = wordTwoCharsCount.values.groupBy { it }.mapValues { it.value.size }
 *
 *         # return if they are the same
 *         return wordOneCountOfCharsCount == wordTwoCountOfCharsCount
 *     }
 */