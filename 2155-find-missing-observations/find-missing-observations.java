class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum = 0;
        for(int val : rolls)sum += val;
        int val = ((rolls.length + n) * mean) - sum;
        if(val < n || val > n*6)return new int[0];
        int avg = val / n;
        int rem = val % n;
        int[] result = new int[n];
        for(int i = 0; i <n; i++){
            result[i] = avg;
            if(rem > 0){
                result[i]++;
                rem--;
            }
        }
        return result;
    }
}