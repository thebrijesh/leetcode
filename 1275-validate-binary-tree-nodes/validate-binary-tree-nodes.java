class Solution {
    
    // Breadth-First Search to check if the given nodes form a valid binary tree
    private boolean isBinaryTreeValid(int root, int[] leftChild, int[] rightChild) {
        boolean[] visited = new boolean[leftChild.length]; // Tracks visited nodes
        Queue<Integer> nodeQueue = new LinkedList<>(); // Queue for BFS traversal
        nodeQueue.offer(root);
        visited[root] = true;

        while (!nodeQueue.isEmpty()) {
            int current = nodeQueue.poll();

            // Check left child
            if (leftChild[current] != -1) {
                if (visited[leftChild[current]]) // Check for cycle
                    return false;

                nodeQueue.offer(leftChild[current]);
                visited[leftChild[current]] = true; // Mark left child as visited
            }

            // Check right child
            if (rightChild[current] != -1) {
                if (visited[rightChild[current]]) // Check for cycle
                    return false;

                nodeQueue.offer(rightChild[current]);
                visited[rightChild[current]] = true; // Mark right child as visited
            }
        }

        // Check if there are multiple components
        for (boolean visit : visited) {
            if (!visit)
                return false;
        }

        return true; // All nodes form a valid binary tree
    }

    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            if(leftChild[i] != -1){
                set.add(leftChild[i]);
            }
            if(rightChild[i] != -1){
                set.add(rightChild[i]);
            }
        }
        int root = -1; int count = 0;
        for(int i = 0; i < n; i++){
            if(!set.contains(i)){
                root = i;
                count++;
            }
        }
        if(root == -1 || count > 1)return false;
        return isBinaryTreeValid(root, leftChild, rightChild); // Check if the tree is valid
    }

}