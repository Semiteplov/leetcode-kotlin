package problems.easy.trees

import problems.TreeNode
import kotlin.math.abs
import kotlin.math.min

// https://leetcode.com/problems/closest-binary-search-tree-value/
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
class Solution270 {
    fun closestValue(root: TreeNode?, target: Double): Int {
        if (root != null) {
            return dfs(root, target, root.`val`)
        }
        return 0
    }

    private fun dfs(root: TreeNode?, target: Double, closest: Int): Int {
        if (root == null) return closest
        var closestValue = closest
        closestValue = if (abs(root.`val` - target) < abs(closestValue - target)) {
            root.`val`
        } else if (abs(root.`val` - target) == abs(closestValue - target)) {
            min(closestValue, root.`val`)
        } else {
            closestValue
        }

        closestValue = if (target > root.`val`.toDouble()) {
            dfs(root.right, target, closestValue)
        } else {
            dfs(root.left, target, closestValue)
        }

        return closestValue
    }
}