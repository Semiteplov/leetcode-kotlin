package problems.medium.graphs

// https://leetcode.com/problems/number-of-provinces/
class Solution547 {
    private val adjacencyList = mutableMapOf<Int, MutableList<Int>>()
    private var answer = 0

    fun findCircleNum(isConnected: Array<IntArray>): Int {
        val visited = MutableList(isConnected.size) { false }

        for (i in isConnected.indices) {
            for (j in isConnected[i].indices) {
                if (isConnected[i][j] == 1) {
                    adjacencyList.getOrPut(i) { mutableListOf() }.add(j)
                    adjacencyList.getOrPut(j) { mutableListOf() }.add(i)
                }
            }
        }

        for (i in isConnected.indices) {
            if (!visited[i]) {
                dfs(visited, i)
                answer++
            }
        }

        return answer
    }

    private fun dfs(visited: MutableList<Boolean>, startNode: Int) {
        visited[startNode] = true
        adjacencyList[startNode]?.forEach { node ->
            if (!visited[node]) dfs(visited, node)
        }
    }
}