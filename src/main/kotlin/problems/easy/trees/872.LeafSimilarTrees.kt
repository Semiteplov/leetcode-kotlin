package problems.easy.trees

import problems.TreeNode

// https://leetcode.com/problems/leaf-similar-trees/
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
class Solution872 {
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        val list1 = mutableListOf<Int>()
        val list2 = mutableListOf<Int>()
        dfs(root1, list1)
        dfs(root2, list2)
        if (list1.size != list2.size) return false
        for (i in list1.indices) {
            if (list1[i] != list2[i]) return false
        }
        return true
    }

    fun dfs(root: TreeNode?, list: MutableList<Int>) {
        root ?: return

        if (root.left == null && root.right == null) list += root.`val`
        dfs(root.left, list)
        dfs(root.right, list)
    }
}