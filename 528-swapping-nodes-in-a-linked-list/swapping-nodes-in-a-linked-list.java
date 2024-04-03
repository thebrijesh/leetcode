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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        ListNode temp2 = head;
        while(k-- != 1){
            head = head.next;
        }
        ListNode firstv = head;  

        while(head.next != null ){
            temp = temp.next;
            head = head.next;
        }

        ListNode secv = temp;

        int tempp = firstv.val;
        firstv.val = secv.val;
        secv.val = tempp;
    return temp2;
    }
}