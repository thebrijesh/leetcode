class Solution {
    public double averageWaitingTime(int[][] customers) {
        long waittime = 0;
        int finishtime = -1;
        for(int[] c : customers){
            int a = c[0];
            int t = c[1];
            if(finishtime <= a){
                finishtime = a;
            }
            
            waittime += (finishtime + t - a);
            finishtime += t;
        }
        
        return (double) waittime / customers.length;
    }
}
