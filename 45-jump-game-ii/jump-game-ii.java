class Solution {
    public static int jump(int[] nums) {
        int currentMaxReach = 0;
        int jumps = 0;
        int farthest = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            
            if (i == currentMaxReach) {
                jumps++;
                currentMaxReach = farthest;
            }
        }
        
        return jumps;
    }
}