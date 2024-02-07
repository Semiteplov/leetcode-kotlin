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
class Solution1302 {
    fun deepestLeavesSum(root: TreeNode?): Int {
        if (root == null) return 0
        val queue = ArrayDeque<TreeNode>()
        queue.add(root)
        var answer = 0
        while (queue.isNotEmpty()) {
            answer = 0
            for (i in 0..<queue.size) {
                val node = queue.removeFirst()
                answer += node.`val`
                node.left?.let { queue.add(node.left!!) }
                node.right?.let { queue.add(node.right!!) }
            }
        }

        return answer
    }
}