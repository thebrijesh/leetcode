/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private ListNode reverse(ListNode head, int count) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;
        while (cur != null && count > 0) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;

            // EXTRA CASE ADDS UP...
            count--;
        }
        head.next = next;
        return prev;
    }


    public ListNode reverseEvenLengthGroups(ListNode head) {
        // only the swaping is possible
        // BASIC START POINT
        int counter = 2;

        ListNode cur = head.next;
        ListNode prev = head;
        while (cur != null) {
            ListNode l_curr = cur; // copy of the head.next
            ListNode l_prev = prev; // copy of the head
            int count = 0;
            while (cur != null && count < counter) {
                prev = cur;
                cur = cur.next;
                count++;
            }

            // if even number then REVERSE IT...
            // increase the counter...
            if (Math.min(count, counter) % 2 == 0) {
                ListNode newHead = reverse(l_curr, Math.min(count, counter));
                l_prev.next = newHead;
                prev = l_curr;
            }
            counter++;
        }
        return head;
    }
}