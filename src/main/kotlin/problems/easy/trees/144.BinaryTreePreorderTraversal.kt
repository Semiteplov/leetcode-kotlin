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
class Solution144 {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        val list = mutableListOf<Int>()
        dfs(root, list)
        return list
    }

    private fun dfs(root: TreeNode?, list: MutableList<Int>) {
        if (root == null) return

        list += root.`val`
       dfs(root.left, list)
       dfs(root.right, list)
    }
}