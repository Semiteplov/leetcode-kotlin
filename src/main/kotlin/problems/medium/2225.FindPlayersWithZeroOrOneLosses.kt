package problems.medium

// https://leetcode.com/problems/find-players-with-zero-or-one-losses/
fun findWinners(matches: Array<IntArray>): List<List<Int>> {
    val map = HashMap<Int, Int>()
    val winners = mutableListOf<Int>()
    val losers = mutableListOf<Int>()

    for (match in matches) {
        map[match[0]] = map.getOrDefault(match[0], 0)
        map[match[1]] = map.getOrDefault(match[1], 0) + 1
    }
    for (entry in map.entries) {
        if (entry.value == 0) {
            winners.add(entry.key)
        } else if (entry.value == 1) {
            losers.add(entry.key)
        }
    }

    winners.sort()
    losers.sort()

    return mutableListOf<List<Int>>(winners, losers)
}