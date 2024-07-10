class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // Handle base cases
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Find the length of the linked list
        ListNode current = head;
        int size = 1; // Start with 1 to count the head node
        while (current.next != null) {
            size++;
            current = current.next;
        }

        // Calculate the effective rotation amount
        int mod = k % size;
        if (mod == 0) {
            return head; // No rotation needed
        }

        // Find the new head position after rotation
        int stepsToNewHead = size - mod - 1;
        ListNode newTail = head;
        for (int i = 0; i < stepsToNewHead; i++) {
            newTail = newTail.next;
        }

        // Rotate the list
        ListNode newHead = newTail.next;
        newTail.next = null; // Disconnect the list at the new tail

        // Link the old tail to the original head to complete the rotation
        current.next = head;

        return newHead;
    }
}
