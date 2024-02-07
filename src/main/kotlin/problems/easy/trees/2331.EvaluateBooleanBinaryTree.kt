package problems.easy.trees

import problems.TreeNode

// https://leetcode.com/problems/evaluate-boolean-binary-tree/
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
class Solution2331 {
    private fun evaluateTree(root: TreeNode?): Boolean {
        return when (root?.`val`) {
            0 -> false
            1 -> true
            2 -> evaluateTree(root.left) or evaluateTree(root.right)
            else -> evaluateTree(root?.left) and evaluateTree(root?.right)
        }
    }

    fun evaluateTree2(root: TreeNode?): Boolean {
        if (root?.left == null && root?.right == null) {
            return root?.`val` == 1
        }
        val left = evaluateTree(root.left)
        val right = evaluateTree(root.right)
        return if (root.`val` == 2) {
            left || right
        } else {
            left && right
        }
    }
}