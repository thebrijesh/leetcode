class Solution {
    public int[] singleNumber(int[] nums) {
        int val1 = 0;
        int val2 = 0;
       int xor = 0;
       int[] ans = new int[2];
       for(int num : nums) xor ^= num;
        int i = 0;
       while(((1 << i) & xor )== 0){
        i++;
       }
        System.out.print(i);

        for(int j = 0; j < nums.length; j++){
            if(((1 << i) & nums[j] )== 0){
                val1 ^= nums[j];
            }else{
                val2 ^= nums[j];
            }
        }
        ans[0] = val1;
        ans[1] = val2;
       return ans;
    }
}