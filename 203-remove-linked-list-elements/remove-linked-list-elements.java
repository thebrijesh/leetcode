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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(100);
        ListNode ans = temp;
        while (head != null && head.next != null) {
            if (head.val != val) {
                temp.next = head;
                temp = temp.next;
                head = head.next;
            } else {

                head = head.next;

            }

        }
        if (head != null && head.val != val) {
            temp.next = head;
            temp = temp.next;
        }
        if (temp != null) {
            temp.next = null;
        }
        return ans.next;
    }
}