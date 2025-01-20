class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;          // Step 1: Initialize the `slow` pointer at the head.
        ListNode fast = head;          // Step 2: Initialize the `fast` pointer at the head.

        while (fast != null && fast.next != null) { // Step 3: Traverse the list while `fast` and `fast.next` are not null.
            slow = slow.next;         // Step 4: Move `slow` one step ahead.
            fast = fast.next.next;    // Step 5: Move `fast` two steps ahead.
        }

        return slow;                  // Step 6: When the loop ends, `slow` points to the middle node.
    }
}
