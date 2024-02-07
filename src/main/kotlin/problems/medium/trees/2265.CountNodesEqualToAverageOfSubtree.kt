package problems.medium.trees

import problems.TreeNode

// https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/description/
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
class Solution2265 {
    var answer = 0

    fun averageOfSubtree(root: TreeNode?): Int {
        dfs(root)
        return answer
    }

    fun dfs(root: TreeNode?): Pair<Int, Int> {
        root ?: return Pair(0, 0)

        val left = dfs(root.left)
        val right = dfs(root.right)

        val numberOfNodes = left.first + right.first + 1
        val sumOfNodes = left.second + right.second + root.`val`
        if (root.`val` == sumOfNodes / numberOfNodes) answer++

        return Pair(numberOfNodes, sumOfNodes)
    }
}