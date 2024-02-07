package problems.easy.trees

import problems.TreeNode

class Solution94 {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val res = mutableListOf<Int>()
        inorder(root, res)
        return res
    }

    private fun inorder(node: TreeNode?, res: MutableList<Int>) {
        node?.let {
            inorder(node.left, res)
            res.add(node.`val`)
            inorder(node.right, res)
        }
    }
}