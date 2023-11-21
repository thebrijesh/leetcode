class Solution {
    public double averageWaitingTime(int[][] customers) {
        long ti = 0;
        int pr = -1;
        for(int[] c : customers){
            int a = c[0];
            int t = c[1];
            if(pr <= a){
                pr = a;
            }
            
            ti += (pr + t - a);
            pr += t;
        }
        
        return (double) ti / customers.length;
    }
}
