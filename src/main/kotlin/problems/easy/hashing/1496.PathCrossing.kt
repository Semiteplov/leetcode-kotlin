package problems.easy.hashing

// https://leetcode.com/problems/path-crossing/
fun isPathCrossing(path: String): Boolean {
    var x = 0
    var y = 0
    val set = mutableSetOf<Pair<Int, Int>>()
    set.add(Pair(x ,y))

    for (s in path) {
        when (s) {
            'N' -> y++
            'S' -> y--
            'E' -> x++
            'W' -> x--
        }
        if (set.contains(Pair(x ,y))) {
            return true
        }
        set.add(Pair(x ,y))
    }


    return false
}