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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode firstNode = head;
        
        ListNode pre = head;
        head = head.next;

        while(head != null){
            int gcd = findGCD(pre.val,head.val);
            pre.next = new ListNode(gcd,head);
            pre = head;
            head = head.next;

        }

        return firstNode;
    }

    public int findGCD(int a, int b){
       if (b == 0)   
        return a;     
        return findGCD(b, a % b);  
    }
}