package problems.easy.trees

import problems.TreeNode

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
class Solution700 {
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        if (root == null) return null

        if (root.`val` == `val`) return root
        return if (root.`val` > `val`) searchBST(root.left, `val`) else searchBST(root.right, `val`)
    }
}