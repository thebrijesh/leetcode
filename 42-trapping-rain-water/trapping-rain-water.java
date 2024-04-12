class Solution {
    public int trap(int[] height) {
        int totalWater = 0;
        int n = height.length;

        for (int i = 0; i < n; i++) {
            int leftMax = 0;
            int rightMax = 0;

            // Find the maximum height on the left side (including the current bar)
            for (int j = i; j >= 0; j--) {
                leftMax = Math.max(leftMax, height[j]);
            }

            // Find the maximum height on the right side (including the current bar)
            for (int j = i; j < n; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }

            // Calculate the amount of water trapped at the current bar
            int trappedWater = Math.min(leftMax, rightMax) - height[i];

            // Add the trapped water to the total water
            totalWater += trappedWater;
        }
        return totalWater;
    }
}