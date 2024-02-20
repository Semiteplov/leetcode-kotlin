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
class Solution965 {
    fun isUnivalTree(root: TreeNode?): Boolean {
        root ?: return true
        return dfs(root, root.`val`)
    }

    fun dfs(root: TreeNode?, value: Int): Boolean {
        root ?: return true
        if (root.`val` != value) return false

        val left = dfs(root.left!!, value)
        val right = dfs(root.right!!, value)

        return left && right
    }
}