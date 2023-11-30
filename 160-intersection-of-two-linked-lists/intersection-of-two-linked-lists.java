/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;
        int count1 = 0, count2 = 0;
        while(temp != null){
            temp = temp.next;
            count1++;
        }
        ListNode temp1 = headB;
        while(temp1 != null){
            temp1 = temp1.next;
            count2++;
        }
        ListNode temp2 = headA;
        ListNode temp3 = headB;
        while(temp2 != null){
            if(temp2 == temp3)return temp2;
            if(count2 > count1){
                temp3 = temp3.next;
                count2--;
            }else if(count2 < count1){
                temp2 = temp2.next;
                count1--;
            }else{
                temp3 = temp3.next;
                temp2 = temp2.next;
            }
        }
        return temp2;
    }
}