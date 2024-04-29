class Solution {
    public int minOperations(int[] nums, int k) {
        int xor = 0;

        for(int num : nums){
            xor ^= num;
        }
        int ans = 0;
        for(int i = 0; i < 32; i++){
            if((xor & (1 << i)) != (k & (1 << i))){
                ans++;
            }
        }

        return ans;
    }
}