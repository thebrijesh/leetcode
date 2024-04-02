/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;
        ListNode temp = new ListNode(100);
        ListNode ans = temp;
        boolean flag = false;
        while (!flag) {
            int min = 0;
            flag = true;

            for (int j = 0; j < lists.length; j++) {
                if (lists[j] != null && (lists[min] == null || lists[min].val > lists[j].val)) {

                    min = j;
                    flag = false;
                }
            }

            if (lists[min] != null) {
                if (min == 0)
                    flag = false;
                temp.next = lists[min];
                temp = temp.next;
                lists[min] = lists[min].next;

            }
        }
        return ans.next;
    }
}