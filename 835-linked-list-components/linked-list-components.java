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
        boolean flag = false;
        HashSet<Integer> set = new HashSet<>(10001);
        for (var num : nums) {
            set.add(num);
        }
        while (head != null) {


            if (set.contains(head.val)) {
                if (!flag) {
                    count++;
                    flag = true;

                }

            } else {
                flag = false;
            }


            head = head.next;

        }
        return count;
    }
}