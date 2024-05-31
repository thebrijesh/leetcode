class Solution {
    public int singleNumber(int[] nums) {
        int count = 0;
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (((1 << i) & nums[j]) != 0) {
                    count++;
                }

                
            }

            if (count % 3 != 0) {
                    ans |= (1 << i);
                }

        }

        return ans;
    }
}