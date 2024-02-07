package problems.easy.trees

import problems.TreeNode

// https://leetcode.com/problems/range-sum-of-bst/
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
class Solution938 {
    var answer = 0
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        if (root == null) return 0

        if (root.`val` in low..high) answer += root.`val`
        rangeSumBST(root.left, low, high)
        rangeSumBST(root.right, low, high)

        return answer
    }
}