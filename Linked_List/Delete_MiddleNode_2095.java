/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // Base case: if the list is empty or has only one node
        if (head == null || head.next == null) {
            return null; // Return null since there's no middle node to delete
        }

        // Use two pointers: slow and fast
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null; // To keep track of the node before the middle node

        // Move fast pointer twice as fast as the slow pointer
        while (fast != null && fast.next != null) {
            prev = slow; // Save the previous node
            slow = slow.next; // Move slow one step
            fast = fast.next.next; // Move fast two steps
        }

        // At this point, 'slow' is at the middle node
        // 'prev' is the node before the middle node
        prev.next = slow.next; // Skip the middle node

        return head; // Return the head of the updated list
    }
}
