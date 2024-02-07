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
class Solution515 {
    fun largestValues(root: TreeNode?): List<Int> {
        if (root == null) return emptyList()
        val queue = ArrayDeque<TreeNode>()
        queue.add(root)
        val answer = mutableListOf<Int>()

        while (queue.isNotEmpty()) {
            answer += queue.maxOf { it.`val` }
            for (i in 0..<queue.size) {
                val node = queue.removeFirst()
                if (node.left != null) queue.add(node.left!!)
                if (node.right != null) queue.add(node.right!!)
            }
        }

        return answer
    }
}