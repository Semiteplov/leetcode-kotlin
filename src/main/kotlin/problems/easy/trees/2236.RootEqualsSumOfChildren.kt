package problems.easy.trees

import problems.TreeNode

// https://leetcode.com/problems/root-equals-sum-of-children/
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
class Solution2236 {
    fun checkTree(root: TreeNode?): Boolean {
        return if (root != null) (root.left!!.`val` + root.right!!.`val`) == root.`val` else false
    }
}