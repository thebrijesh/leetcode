class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
       int lastrange =-1;
       int ans = 0;

       for(int i =0; i<timeSeries.length; i++){
           if(timeSeries[i] > lastrange){
               lastrange = timeSeries[i] + (duration -1);
               ans += duration;
           }else if(timeSeries[i] <= lastrange){
               int cans = timeSeries[i] + (duration-1);
               ans += cans - lastrange;
               lastrange = cans;
           }
       }
       return ans;
    }
}