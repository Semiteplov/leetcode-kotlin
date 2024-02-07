package course.trees

import java.util.*
import kotlin.math.max


// https://leetcode.com/problems/count-good-nodes-in-binary-tree/
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
class CountGoodNodesInBinaryTree {
    fun goodNodes(root: TreeNode?): Int {
        return dfs(root, Int.MIN_VALUE)
    }

    fun dfs(node: TreeNode?, maxSoFar: Int): Int {
        if (node == null) return 0

        val left = dfs(node.left, max(node.`val`, maxSoFar))
        val right = dfs(node.right, max(node.`val`, maxSoFar))
        var answer = left + right
        if (node.`val` >= maxSoFar) answer++
        return answer
    }
}

internal class Pair(var node: TreeNode?, var maxSoFar: Int)

internal class IterativeCountGoodNodesInBinaryTree {
    fun goodNodes(root: TreeNode?): Int {
        val stack = Stack<Pair>()
        stack.push(Pair(root, Int.MIN_VALUE))
        var ans = 0
        while (!stack.empty()) {
            val pair = stack.pop()
            val node = pair.node
            val maxSoFar = pair.maxSoFar
            if (node!!.`val` >= maxSoFar) {
                ans++
            }
            if (node.left != null) {
                stack.push(Pair(node.left, max(maxSoFar, node.`val`)))
            }
            if (node.right != null) {
                stack.push(Pair(node.right, max(maxSoFar, node.`val`)))
            }
        }
        return ans
    }
}