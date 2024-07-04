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
    public ListNode mergeNodes(ListNode head) {
        int sum = 0;
        ListNode ans = head;
        ListNode mans = ans;
        ListNode temp = head.next;
        while(temp != null){
            
            if(temp.val == 0){
                ans = ans.next;
                ans.val = sum;
                sum = 0;
            }else{
                sum += temp.val;
            }

            temp = temp.next;
        }
        ans.next = null;
        return mans.next;
    }
}