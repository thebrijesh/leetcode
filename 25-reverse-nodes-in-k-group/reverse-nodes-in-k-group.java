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
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1)
            return head;
        ListNode h = head;
        int count = 0;
        while (h != null) {
            count++;
            h = h.next;
        }
        int hm = count / k;
        ListNode currStart = null;
        ListNode prevStart = null;
        ListNode ans = null;
        ListNode pre = null;
        ListNode curr = head;
        ListNode upcoming = null;
        boolean flag = true;
        while (hm != 0) {
            int kD = k;
            if (curr == head) {
                kD = k;
            }
            currStart = curr;
            while (kD != 0 && curr != null) {
                upcoming = curr.next;
                curr.next = pre;
                pre = curr;
                curr = upcoming;
                kD--;
            }

            if (prevStart == null) {
                ans = pre;
                prevStart = currStart;
            } else {
                prevStart.next = pre;
                prevStart = currStart;
            }
            hm--;
        }
        if (curr != null) {
            prevStart.next = curr;
        } else {
            prevStart.next = null;

        }
        return ans;
    }
}