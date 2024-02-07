package problems.medium.trees

import problems.TreeNode

// https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
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
    fun bstToGst(root: TreeNode?): TreeNode? {
        bstToGstHelper(root, 0)
        return root
    }

    private fun bstToGstHelper(root: TreeNode?, s: Int): Int {
        if (root == null) return 0
        var sum = root.`val` + bstToGstHelper(root.right, s)
        root.`val` = sum + s
        sum += bstToGstHelper(root.left, root.`val`)
        return sum
    }
}