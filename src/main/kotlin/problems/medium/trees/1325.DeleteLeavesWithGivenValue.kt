package problems.medium.trees

import problems.TreeNode

// https://leetcode.com/problems/delete-leaves-with-a-given-value/description/
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
class Solution1325 {

    private fun removeLeafNodes(root: TreeNode?, target: Int): TreeNode? {
        root ?: return null

        root.left = removeLeafNodes(root.left, target)
        root.right = removeLeafNodes(root.right, target)

        return if (root.isTarget(target)) {
            null
        } else {
            root
        }

    }

    private fun TreeNode.isTarget(target: Int): Boolean {
        return this.left == null && this.right == null && this.`val` == target
    }
}