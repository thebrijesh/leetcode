class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        double[] time = new double[dist.length];
        
        for(int i = 0; i < dist.length; i++){
            time[i] = ((double)dist[i] / (double)speed[i]);

        }
        Arrays.sort(time);
        int count = 0;
        int stick = 0;

        for(int i = 0; i < time.length; i++){
            if(time[i] > i){
                count++;
               
            }else{
                break;
            }
        }

        return count;
    }
}