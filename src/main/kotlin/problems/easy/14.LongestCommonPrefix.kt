package problems.easy

// https://leetcode.com/problems/longest-common-prefix/description/
fun longestCommonPrefix(strs: Array<String>): String {
    val word = strs[0]
    word.forEachIndexed { i, c ->
        if (strs.any { it.length == i || it[i] != c } ) return word.take(i)
    }
    return word
}