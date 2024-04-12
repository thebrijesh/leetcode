class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        int i = 0;
        while(i++ < n)q.add(i);
        System.out.print(q);
        int count = 1;
        while(q.size() > 1){
            if(count == k){
                q.poll();
                count = 1;
            }else{
                q.add(q.poll());
                count++;
            }
            
        }
        return q.peek();
    }
}