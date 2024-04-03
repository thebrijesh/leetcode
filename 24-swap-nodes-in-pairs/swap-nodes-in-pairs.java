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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)return head;
        ListNode temp = head.next;
        ListNode pre = null;
        ListNode first = head;
        ListNode sec = head.next;
        ListNode upcoming = null;

        while (first != null && first.next != null) {
            sec = first.next;
            if (pre == null) {

                pre = sec;
            }else{
                pre.next = sec;

            }
            upcoming = sec.next;
            
            sec.next = first;
            first.next = upcoming;

            pre = first;
            first = upcoming;

            
        }
        return temp;
    }
}