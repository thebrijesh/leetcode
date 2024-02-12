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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head.next == null || head == null) {
            return head;
        }
        int i = 1;
        ListNode node;
        ListNode mhead = head;
        while (i < left - 1) {
            head = head.next;
            i++;
        }
        node = head;
        ListNode list2 = head.next;
        ListNode upcoming = null;
        ListNode curr = head.next;
        ListNode pre = head;
        if (left == 1) {
            pre = null;
            curr = head;
            list2 = head;
            i--;
        }

        while (i != right && curr != null) {
            upcoming = curr.next;
            curr.next = pre;
            pre = curr;
            curr = upcoming;
            i++;
        }
        if (left == 1) {
            mhead = pre;
        } else {
            node.next = pre;
        }
        list2.next = curr;
        return mhead;
    }

}