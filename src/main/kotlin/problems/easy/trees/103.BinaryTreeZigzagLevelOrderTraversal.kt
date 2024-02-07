package problems.easy.trees

import problems.TreeNode

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution103 {
    fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
        if (root == null) return emptyList()
        val queue = ArrayDeque<TreeNode>()
        queue.add(root)
        val answer = mutableListOf<List<Int>>()
        var level = 1

        while (queue.isNotEmpty()) {
            val currentLevel = mutableListOf<Int>()

            for (i in 0..<queue.size) {
                val node = queue.removeFirst()
                currentLevel += node.`val`
                node.left?.let { queue.add(node.left!!) }
                node.right?.let { queue.add(node.right!!) }
            }

            if (level % 2 == 0) {
                currentLevel.reverse()
            }
            level++

            answer += currentLevel
        }

        return answer
    }
}