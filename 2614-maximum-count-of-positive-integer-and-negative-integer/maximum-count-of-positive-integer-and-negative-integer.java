class Solution {
    /**
     * Returns the maximum count between negative and positive numbers in the array.
     * 
     * @param nums an array of integers
     * @return the maximum count of negative or positive numbers
     */
    public int maximumCount(int[] nums) {
        // Count the number of negative and positive numbers
        int negativeCount = countNegativeNumbers(nums);
        int positiveCount = countPositiveNumbers(nums);
        
        // Return the maximum of the two counts
        return Math.max(negativeCount, positiveCount);
    }

    /**
     * Counts the number of negative numbers using binary search.
     * 
     * @param nums an array of integers
     * @return the count of negative numbers
     */
    private int countNegativeNumbers(int[] nums) {
        // Find the position where the first non-negative number appears
        return binarySearch(nums, 0);
    }

    /**
     * Counts the number of positive numbers using binary search.
     * 
     * @param nums an array of integers
     * @return the count of positive numbers
     */
    private int countPositiveNumbers(int[] nums) {
        // Subtract the index of the first positive number from the array length
        return nums.length - binarySearch(nums, 1);
    }

    /**
     * Binary search to find the first occurrence of a target or greater number.
     * 
     * @param nums an array of integers
     * @param target the value to find
     * @return the index of the first occurrence of the target or the first element greater than the target
     */
    private int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int position = nums.length; // Default to array length if no element is found

        while (left <= right) {
            // Calculate the mid-point to avoid overflow
            int mid = left + (right - left) / 2;

            // Check if mid element is less than the target
            if (nums[mid] < target) {
                left = mid + 1; // Move right to find a larger number
            } else {
                position = mid; // Potential valid position found
                right = mid - 1; // Move left to find an earlier occurrence
            }
        }

        return position;
    }
}
