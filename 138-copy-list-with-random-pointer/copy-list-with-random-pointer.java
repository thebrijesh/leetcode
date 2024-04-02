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
    HashMap<Node, Node> nodeMap = new HashMap<>();
    Node pointer = head;
    while (pointer != null) {
      Node copy = new Node(pointer.val);
      nodeMap.put(pointer, copy);
      pointer = pointer.next;
    }
    pointer = head;
    while (pointer != null) {
      Node processed = nodeMap.get(pointer);
      processed.next = nodeMap.get(pointer.next);
      processed.random = nodeMap.get(pointer.random);
      pointer = pointer.next;
    }
    return nodeMap.get(head);
  }
}