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
class Solution101 {
    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) return true
        return dfs(root.left, root.right)
    }

    private fun dfs(tree: TreeNode?, flippedTree: TreeNode?): Boolean {
        if (tree == null && flippedTree == null) return true

        if (tree == null || flippedTree == null) return false
        if (tree.`val` != flippedTree.`val`) return false

        val leftTree = dfs(tree.left, flippedTree.right)
        val rightTree = dfs(tree.right, flippedTree.left)
        return leftTree && rightTree
    }
}