class Solution {
    public double averageWaitingTime(int[][] customers) {
        long time = 0;
        int prev = -1;
        for(int[] c : customers){
            int a = c[0];
            int t = c[1];
            if(prev <= a){
                prev = a;
            }
            
            time += (prev + t - a);
            prev += t;
        }
        
        return (double) time / customers.length;
    }
}