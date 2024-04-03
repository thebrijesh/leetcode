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
    public void reorderList(ListNode head) {
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode pre = null;
        ListNode curr = slow.next;
        slow.next = null;
        ListNode upcoming = null;

        while(curr != null){
            upcoming = curr.next;
            curr.next = pre;
            pre = curr;
            curr = upcoming;
        }
        ListNode ans = new ListNode(100);
        while(pre != null){
            ans.next = temp;
            ans = ans.next;
            temp = temp.next;
            ans.next = pre;
            ans = ans.next;
            
            pre = pre.next;
        }

        if(temp != null){
            ans.next = temp;
            ans = ans.next;
        }
        if(ans != null)
            ans.next = null;
    }
}