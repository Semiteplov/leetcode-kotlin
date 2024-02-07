package course.trees

import java.util.*


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
class SameTree {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null) return true
        if (p == null || q == null) return false

        if (p.`val` != q.`val`) return false

        val left = isSameTree(p.left, q.left)
        val right = isSameTree(p.right, q.right)

        return left && right
    }
}


internal class SameTreePair(var p: TreeNode?, var q: TreeNode?)

internal class IterativeSolution {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        val stack = Stack<SameTreePair>()
        stack.push(SameTreePair(p, q))
        while (!stack.empty()) {
            val pair = stack.pop()
            val node1 = pair.p
            val node2 = pair.q
            if (node1 == null && node2 == null) {
                continue
            }
            if (node1 == null || node2 == null) {
                return false
            }
            if (node1.`val` != node2.`val`) {
                return false
            }
            stack.push(SameTreePair(node1.left, node2.left))
            stack.push(SameTreePair(node1.right, node2.right))
        }
        return true
    }
}