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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head1 = reverse(l1);
        ListNode head2 = reverse(l2);

        int carry = 0;
        ListNode temp = new ListNode(100);
        ListNode ans = temp;
        while (head1 != null && head2 != null) {
            int sum = head1.val + head2.val + carry;

            carry = sum / 10;

            temp.next = new ListNode(sum % 10);
            temp = temp.next;
            head1 = head1.next;
            head2 = head2.next;
        }
        while (head1 != null) {
            int sum = head1.val + carry;

            carry = sum / 10;

            temp.next = new ListNode(sum % 10);

            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            int sum = head2.val + carry;

            carry = sum / 10;

            temp.next = new ListNode(sum % 10);

            head2 = head2.next;
            temp = temp.next;
        }
        if (carry > 0)
            temp.next = new ListNode(carry);

        ans = reverse(ans.next);

        return ans;

    }

    public ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        ListNode upcoming = null;

        while (curr != null) {
            upcoming = curr.next;
            curr.next = pre;
            pre = curr;
            curr = upcoming;
        }
        return pre;
    }
}