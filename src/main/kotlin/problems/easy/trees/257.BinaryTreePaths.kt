package problems.easy.trees

import problems.TreeNode

// https://leetcode.com/problems/binary-tree-paths/
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
class Solution257 {
    fun binaryTreePaths(root: TreeNode?): List<String> {
        val answer = mutableListOf<String>()

        fun dfs(root: TreeNode?, path: String) {
            if (root == null) return

            val newPath = if (path.isEmpty()) root.`val`.toString() else "$path->${root.`val`}"
            if (root.left == null && root.right == null) {
                answer += newPath
                return
            }

            dfs(root.left, newPath)
            dfs(root.right, newPath)
        }

        dfs(root, "")
        return answer
    }
}