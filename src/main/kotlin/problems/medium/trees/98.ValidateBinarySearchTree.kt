package problems.medium.trees

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
class Solution98 {
    fun isValidBST(root: TreeNode?): Boolean {
        val prev = arrayOfNulls<Int?>(1)
        return inorder(root, prev)
    }

    private fun inorder(node: TreeNode?, prev: Array<Int?>): Boolean {
        if (node == null) return true

        val left = inorder(node.left, prev)
        prev[0]?.let { if (it >= node.`val`) return false }
        prev[0] = node.`val`
        val right = inorder(node.right, prev)

        return left && right
    }
}


internal class JavaSolution {
    fun isValidBST(root: TreeNode?): Boolean {
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE)
    }

    private fun dfs(node: TreeNode?, small: Long, large: Long): Boolean {
        if (node == null) {
            return true
        }
        if (small >= node.`val` || node.`val` >= large) {
            return false
        }
        val left = dfs(node.left, small, node.`val`.toLong())
        val right = dfs(node.right, node.`val`.toLong(), large)
        return left && right
    }
}