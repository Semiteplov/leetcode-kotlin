package course.trees

import kotlin.math.max

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
class DiameterOfBinaryTree {
    private var diameter = 0
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        dfs(root)
        return diameter
    }

    fun dfs(root: TreeNode?): Int {
        if (root == null) return 0

        val leftPath = dfs(root.left)
        val rightPath = dfs(root.right)

        diameter = max(diameter, leftPath + rightPath)

        return max(leftPath, rightPath) + 1
    }
}