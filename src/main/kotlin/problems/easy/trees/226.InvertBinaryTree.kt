package problems.easy.trees

import problems.TreeNode

// https://leetcode.com/problems/invert-binary-tree/
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
class Solution226 {
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) return null

        val invertedLeft = invertTree(root.left)
        val invertedRight = invertTree(root.right)
        root.left = invertedRight
        root.right = invertedLeft

        return root
    }
}