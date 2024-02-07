package course.trees

import java.util.*

// https://leetcode.com/problems/path-sum/description/
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
class PathSum {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        return dfs(root, 0, targetSum)
    }

    private fun dfs(root: TreeNode?, curr: Int, targetSum: Int): Boolean {
        if (root == null) return false
        val sum = curr + root.`val`
        if (root.left == null && root.right == null) return sum == targetSum

        val left = dfs(root.left, sum, targetSum)
        val right = dfs(root.right, sum, targetSum)

        return left || right
    }
}


internal class IterativePathSum {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if (root == null) {
            return false
        }
        val stack: Stack<NodePair> = Stack<NodePair>()
        stack.push(NodePair(root, 0))
        while (!stack.empty()) {
            val pair: NodePair = stack.pop()
            val node: TreeNode = pair.node
            var curr: Int = pair.curr
            if (node.left == null && node.right == null) {
                if (curr + node.`val` == targetSum) {
                    return true
                }
            }
            curr += node.`val`
            if (node.left != null) {
                stack.push(NodePair(node.left!!, curr))
            }
            if (node.right != null) {
                stack.push(NodePair(node.right!!, curr))
            }
        }
        return false
    }
}


internal class NodePair(var node: TreeNode, var curr: Int)