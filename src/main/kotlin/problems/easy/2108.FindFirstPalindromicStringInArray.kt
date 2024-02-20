package problems.easy

class Solution2108 {
    fun firstPalindrome(words: Array<String>): String {
        val answer = words.find { word -> word.isPalindrom() }
        return answer ?: ""
    }

    fun String.isPalindrom(): Boolean {
        var left = 0
        var right = this.length - 1

        while (left < right) {
            if (this[left] != this[right]) return false
            left++
            right--
        }

        return true
    }
}