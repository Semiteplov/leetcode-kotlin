package course.trees

import kotlin.math.*

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
class MinimumDepthOfBinaryTree {
    fun minDepth(root: TreeNode?): Int {
        if (root == null) return 0

        val left = minDepth(root.left)
        val right = minDepth(root.right)

        if (root.left != null && root.right != null) return min(left + 1, right + 1)

        return max(left + 1, right + 1)
    }
}