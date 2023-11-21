class Solution {
    public double averageWaitingTime(int[][] customers) {
        long waittimes = 0;
        int finishtimes = -1;
        for(int[] c : customers){
            int a = c[0];
            int t = c[1];
            if(finishtimes <= a){
                finishtimes = a;
            }
            
            waittimes += (finishtimes + t - a);
            finishtimes += t;
        }
        
        return (double) waittimes / customers.length;
    }
}
