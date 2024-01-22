package problems.easy.hashing

// https://leetcode.com/problems/destination-city/
fun destCity(paths: List<List<String>>): String {
    val map = HashMap<String, String>()
    for (path in paths) {
        map[path[0]] = path[1]
    }
    var res = ""
    for (value in map.values) {
        if (value !in map) {
            res = value
        }
    }
    return res
}