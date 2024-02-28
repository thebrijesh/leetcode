class Solution {

    private boolean isBinaryTreeValid(int root, int[] leftChild, int[] rightChild,HashSet<Integer> set) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int val = queue.peek();
            if(leftChild[val] != -1){
                queue.add(leftChild[val]);
                
            }
            if(rightChild[val] != -1){
                queue.add(rightChild[val]);
                
            }
            set.remove(val);
        
            queue.remove();
        }
        
        if(set.size()!=0)return false;
        return true;
    }

    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (leftChild[i] != -1) {
                if(!set.contains(leftChild[i]))set.add(leftChild[i]);
                else return false;
            }
            if (rightChild[i] != -1) {
                if(!set.contains(rightChild[i]))set.add(rightChild[i]);
                else return false;
            }

        }
        int root = -1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!set.contains(i)) {
                root = i;
                count++;
            }
        }
        if (root == -1 || count > 1)
            return false;
    
        return isBinaryTreeValid(root, leftChild, rightChild, set); // Check if the tree is valid
    }

}