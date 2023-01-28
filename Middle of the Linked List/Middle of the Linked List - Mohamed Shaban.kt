//Author: Mohamed Shaban Ahmed
//Time Complexity: O(n)
//Space Complexity: O(1)
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        var middle = head
        var last = head

        while (last?.next != null) {
            middle = middle!!.next
            last = last.next!!.next
        }
        return middle
    }
}
