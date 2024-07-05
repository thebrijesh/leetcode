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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode curr = head.next;
        ListNode prev  = head;
        int count = 1;
        ArrayList<Integer> arrlis = new ArrayList<>();
        while(curr != null && curr.next != null)
        {
            if(curr.val > prev.val && curr.val > curr.next.val)
            {
                arrlis.add(count);
            }
            if(curr.val<prev.val && curr.val < curr.next.val)
            {
                arrlis.add(count);
            }
            prev = prev.next;
            curr = curr.next;
            count++;
        }
        int[] res = new int[2];
       
        Arrays.fill(res,-1);
        if(arrlis.size() < 2)
        {
            return res;
        }
        int minres = Integer.MAX_VALUE;
        for(int i = 0;i<arrlis.size()-1;i++)
        {
            minres = Math.min(minres,arrlis.get(i+1)-arrlis.get(i));
        }
        res[0] = minres;
        res[1] = arrlis.get(arrlis.size()-1)-arrlis.get(0);
        return res;
    }
}