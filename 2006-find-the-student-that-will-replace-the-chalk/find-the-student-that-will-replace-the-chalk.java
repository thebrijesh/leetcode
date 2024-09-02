class Solution {
    public int chalkReplacer(int[] chalk, int k) {
       
        long sum = 0;
        for (int i = 0; i < chalk.length; i++) {
            sum += chalk[i];
        }
        k %= sum;
       

        for(int i = 0; i < chalk.length; i++){
            if(k - chalk[i] > -1){
                 k = k - chalk[i];
            }else {
                return i;
            }
           
        }
        return 0;
    }
}