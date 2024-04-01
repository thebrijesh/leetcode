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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null)return head;
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        ListNode even = head;
        ListNode odd = null;
        ListNode stail = even.next;
        boolean flag = false;
        while((even != stail && even.next != stail) || flag == false ){
            flag = true;
            odd = even.next;
            even.next =  odd.next;
            tail.next = odd;
            tail = tail.next;
            even = even.next;
        }
        tail.next = null;
        return head;
    }
}