package problems.easy.trees

import problems.TreeNode

// https://leetcode.com/problems/increasing-order-search-tree/
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
class Solution {
    fun increasingBST(root: TreeNode?): TreeNode? {
        if (root == null) return null
        if (root.left == null || root.right == null) return root

        val left = increasingBST(root.left)
        left!!.right = root
        val right = increasingBST(root.right)
        root.right = right

        return root
    }
}