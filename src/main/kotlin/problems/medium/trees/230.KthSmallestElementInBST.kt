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
class Solution230 {
    val sorted = mutableListOf<Int>()

    fun kthSmallest(root: TreeNode?, k: Int): Int {
        dfs(root)
        return sorted[k - 1]
    }

    fun dfs(root: TreeNode?) {
        root ?: return
        root.left?.let {
            dfs(root.left)
        }
        sorted += root.`val`
        root.right?.let {
            dfs(root.right)
        }
    }
}