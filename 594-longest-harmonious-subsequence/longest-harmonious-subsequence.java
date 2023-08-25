class Solution {
   public static int findLHS(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int count1 = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
                if (nums[i] + 1 == nums[j]) {
                    count1++;
                }
            }
            if (count1 != 0) {
                max = Math.max(max, count + count1);
            }
        }
        return max;
    }
}