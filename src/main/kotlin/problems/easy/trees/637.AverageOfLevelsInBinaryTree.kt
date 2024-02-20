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
class Solution637 {
    fun averageOfLevels(root: TreeNode?): DoubleArray {
        root ?: return doubleArrayOf()

        val answer = mutableListOf<Double>()
        val queue = ArrayDeque<TreeNode>()
        queue.add(root)

        while (queue.isNotEmpty()) {
            val levelSize = queue.size
            var sum = 0.0

            for (i in 0..<queue.size) {
                val node = queue.removeFirst()
                sum += node.`val`
                if (node.left != null) queue.add(node.left!!)
                if (node.right != null) queue.add(node.right!!)
            }

            answer.add(sum / levelSize)
        }

        return answer.toDoubleArray()
    }
}