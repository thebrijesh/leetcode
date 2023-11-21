class Solution {
    public double averageWaitingTime(int[][] customers) {
        long waittime = 0;
        int finishtime = -1;
        for(int[] c : customers){
            
            if(finishtime <= c[0]){
                finishtime = c[0];
            }
            
            waittime += (finishtime + c[1] - c[0]);
            finishtime += c[1];
        }
        
        return (double) waittime / customers.length;
    }
}
