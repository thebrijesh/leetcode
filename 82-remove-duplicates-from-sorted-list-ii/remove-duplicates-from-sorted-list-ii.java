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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = new ListNode(100);
        ListNode ans = temp;
        while (head != null && head.next != null) {
            if (head.val != head.next.val) {
                temp.next = head;
                temp = temp.next;
                head = head.next;
            } else {
                ListNode forhead = head;
                while (head != null && head.val == forhead.val) {
                    head = head.next;
                }

            }

        }
        if (head != null) {
            temp.next = head;
            temp = temp.next;
        }
        if (temp != null) {
            temp.next = null;
        }
        return ans.next;
    }
}