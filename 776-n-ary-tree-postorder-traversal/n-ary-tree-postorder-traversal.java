/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        Stack<Node> s = new Stack<Node>();
        List<Integer> res = new LinkedList<>();
        if (root != null) s.push(root);
        while (! s.isEmpty()) {
            Node n = s.pop();
            res.add(n.val);
            for (Node c : n.children) {
                s.push(c);
            }
        }
        Collections.reverse(res);
        return res;
    }
}