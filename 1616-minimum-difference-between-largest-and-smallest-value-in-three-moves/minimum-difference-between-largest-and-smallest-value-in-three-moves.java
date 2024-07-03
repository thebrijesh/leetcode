import java.util.Arrays;

public class Solution {
    
    public int minDifference(int[] nums) {
        // If there are 3 or fewer elements, the min difference is 0
        if (nums.length <= 3) return 0;
        
        // Sort the array
        Arrays.sort(nums);
        
        // Calculate the minimum differences by removing different combinations of 3 elements
        int minDifference1 = nums[nums.length - 4] - nums[0]; // Remove the 3 largest elements
        int minDifference2 = nums[nums.length - 1] - nums[3]; // Remove the 3 smallest elements
        int minDifference3 = nums[nums.length - 3] - nums[1]; // Remove 1 smallest and 2 largest elements
        int minDifference4 = nums[nums.length - 2] - nums[2]; // Remove 2 smallest and 1 largest elements
        
        // Return the minimum of the calculated differences
        return Math.min(Math.min(minDifference1, minDifference2), Math.min(minDifference3, minDifference4));
    }
}
