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
    public int numComponents(ListNode head, int[] nums) {

        boolean[] arr = new boolean[10001]; 
        
        // Setting the values in the nums as true in arr
        for(int i = 0; i < nums.length; i++){
            arr[nums[i]] = true; 
        }

        int result = 0; 

        while(head != null){
            if(arr[head.val]){
                while(head != null && arr[head.val]){
                    head = head.next; 
                }
                result++; 
            }
            else{ 
                head = head.next; 
            }
        }
        return result; 
    }
}