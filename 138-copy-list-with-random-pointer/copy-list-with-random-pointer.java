/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)return head;
        Node temp = head;
        while(head != null){
            Node myNode = new Node(head.val);
            myNode.next = head.next;
            head.next = myNode;

            head = head.next.next;
        } 
        head = temp;
        while(head != null){
            if(head.random != null){
                head.next.random = head.random.next;
            }
           head =  head.next.next;
        }
        head = temp;
        Node ans = head.next;
        Node ansHead = ans;
        while(head != null){
        
        head.next = head.next.next;
        if(ansHead.next != null)
            ansHead.next = ansHead.next.next;
        ansHead = ansHead.next;
        head = head.next;
        }
        return ans;       
    }
}