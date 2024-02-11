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
         int count = 0;
        int i = 0;
        boolean flag = false;
        while (head != null) {
            boolean get = false;

            for (int j = 0; j < nums.length; j++) {
                if (head.val == nums[j]) {
                    if (!flag) {
                        count++;
                        flag = true;

                    }
                    get = true;
                }
            }
            if (!get) {
                flag = false;
            }
            head = head.next;

        }
        return count;
    }
}