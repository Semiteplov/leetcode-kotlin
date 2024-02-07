package problems.easy.trees

import problems.TreeNode
import kotlin.math.abs
import kotlin.math.min

// https://leetcode.com/problems/minimum-absolute-difference-in-bst/
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
class Solution530 {
    fun getMinimumDifference(root: TreeNode?): Int {
        var answer = 100001
        var prev: TreeNode? = null

        fun dfs(root: TreeNode?) {
            root ?: return

            dfs(root.left)

            prev?.let { answer = min(answer, abs(root.`val` - prev!!.`val`)) }
            prev = root
            dfs(root.right)
        }

        dfs(root)
        return answer
    }
}