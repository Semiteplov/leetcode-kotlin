package course.linkedLists

/**
 * https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/704/linked-lists/4597/
 *
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 *
 *
 * Example 1:
 *
 *
 * Input: head = [1,1,2]
 * Output: [1,2]
 * Example 2:
 *
 *
 * Input: head = [1,1,2,3,3]
 * Output: [1,2,3]
 *
 *
 * Constraints:
 *
 * The number of nodes in the list is in the range [0, 300].
 * -100 <= Node.val <= 100
 * The list is guaranteed to be sorted in ascending order.
 */
fun deleteDuplicates(head: ListNode?): ListNode? {
    var current = head

    while (current !== null && current.next !== null) {
        if (current.`val` == current.next!!.`val`) {
            current.next = current.next!!.next
        } else {
            current = current.next
        }

    }

    return head
}