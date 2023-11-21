class Solution {
    public double averageWaitingTime(int[][] customers) {
        long tiiiiiiiiiii = 0;
        int priiiiiiiiii = -1;
        for(int[] c : customers){
            int a = c[0];
            int t = c[1];
            if(priiiiiiiiii <= a){
                priiiiiiiiii = a;
            }
            
            tiiiiiiiiiii += (priiiiiiiiii + t - a);
            priiiiiiiiii += t;
        }
        
        return (double) tiiiiiiiiiii / customers.length;
    }
}
