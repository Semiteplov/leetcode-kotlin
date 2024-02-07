package problems.easy.trees

import problems.TreeNode

// https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
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
class Solution1022 {
    fun sumRootToLeaf(root: TreeNode?): Int {
        return dfs(root, "")
    }

    fun dfs(root: TreeNode?, s: String?): Int {
        if (root == null) return 0

        val binary = s + root.`val`.toString()
        if (root.left == null && root.right == null) {
            return binary.toInt(2)
        }

        val left = dfs(root.left, binary)
        val right = dfs(root.right, binary)

        return left + right
    }
}