package problems.easy.trees

import problems.TreeNode
import java.util.*

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
class Solution199 {
    fun rightSideView(root: TreeNode?): List<Int> {
        if (root == null) return emptyList()

        val answer = mutableListOf<Int>()
        val queue = ArrayDeque<TreeNode>()
        queue.add(root)

        while (queue.isNotEmpty()) {
            var prev = 0

            for (i in 0..<queue.size) {
                val node = queue.removeFirst()
                prev = node.`val`
                if (node.left != null) queue.add(node.left!!)
                if (node.right != null) queue.add(node.right!!)
            }

            answer += prev
        }

        return answer
    }
}