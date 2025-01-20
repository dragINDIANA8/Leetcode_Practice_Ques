class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;          // Step 1: Initialize a variable `prev` to null
        ListNode curr = head;          // Step 2: Set `curr` to the head of the linked list

        while (curr != null) {         // Step 3: Traverse the list until `curr` becomes null
            ListNode nextNode = curr.next; // Step 4: Temporarily store the next node
            curr.next = prev;          // Step 5: Reverse the pointer of the current node to point to `prev`
            prev = curr;               // Step 6: Move `prev` to the current node
            curr = nextNode;           // Step 7: Move `curr` to the next node
        }

        return prev;                   // Step 8: `prev` will now point to the new head of the reversed list
    }
}
