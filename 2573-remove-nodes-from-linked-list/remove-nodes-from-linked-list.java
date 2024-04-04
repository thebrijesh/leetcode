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
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);
        ListNode ans = head;
        int max = head.val;
        ListNode temp = head;
        temp = temp.next;
        while(temp != null){
            
            if(temp.val >= max){
                head.next = temp;
                head = head.next;
                max = temp.val;
            }

            temp = temp.next;

        }
        head.next = null;
        ans = reverse(ans);
        return ans;

    }

    public ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode curr = head;
        ListNode upcoming = null;

        while(curr != null){
            upcoming = curr.next;
            curr.next = pre;
            pre = curr;
            curr = upcoming;

        }
        return pre;
    }
}