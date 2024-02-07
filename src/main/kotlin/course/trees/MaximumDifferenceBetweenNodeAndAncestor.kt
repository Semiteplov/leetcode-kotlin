package course.trees

import kotlin.math.*

// https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/description/

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
class MaximumDifferenceBetweenNodeAndAncestor {
    fun maxAncestorDiff(root: TreeNode?): Int {
        if (root == null) return 0
        return dfs(root, root.`val`, root.`val`)
    }

    fun dfs(root: TreeNode?, max: Int, min: Int): Int {
        if (root == null) return max - min

        val curMax = max(max, root.`val`)
        val curMin = min(min, root.`val`)

        val left = dfs(root.left, curMax, curMin)
        val right = dfs(root.right, curMax, curMin)
        return max(left, right)
    }
}