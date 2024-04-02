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
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0 || head == null || head.next == null)return head;
        ListNode first = head;
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }

        int mod = k % size;
        if(mod == 0)return head;
        for(int i = 0; i < size - mod-1; i++){
            head = head.next;
        }

        ListNode ansHead = head.next;
        ListNode aaHead = head.next;
        head.next = null;
        while(ansHead.next != null){
            ansHead = ansHead.next;
        }
        ansHead.next = first;
return aaHead;
    }
}