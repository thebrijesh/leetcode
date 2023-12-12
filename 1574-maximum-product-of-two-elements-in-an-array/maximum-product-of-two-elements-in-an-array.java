class Solution {
    public int maxProduct(int[] nums) {
        int max = 0; int sMax = 0;
        for(var num : nums){
            if(num > max){
                sMax = max;
                max = num;
            }else if(num > sMax){
                sMax = num;
            }
        }

        return --max * --sMax;
    }
}