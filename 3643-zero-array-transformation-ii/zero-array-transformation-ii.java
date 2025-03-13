import java.util.Arrays;

class Solution {

    /**
     * Finds the minimum number of queries needed to make the array all zeros.
     *
     * @param nums an integer array representing initial values
     * @param queries a 2D integer array representing the operations
     * @return the minimum number of queries needed, or -1 if not possible
     */
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;

        // If all elements are already zero, return 0
        if (Arrays.stream(nums).allMatch(x -> x == 0)) {
            return 0;
        }

        int left = 1;
        int right = queries.length;

        // If even the maximum number of operations can't make the array zero, return -1
        if (!canMakeZeroArray(right, nums, queries)) {
            return -1;
        }

        // Binary search to find the minimum number of operations needed
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canMakeZeroArray(mid, nums, queries)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    /**
     * Checks if it is possible to make the array zero with a given number of operations.
     *
     * @param operations the number of operations to consider
     * @param nums the initial array
     * @param queries the operation queries
     * @return true if the array can be made zero, false otherwise
     */
    private boolean canMakeZeroArray(int operations, int[] nums, int[][] queries) {
        int n = nums.length;
        int[] differenceArray = new int[n + 1];

        // Apply difference array technique to accumulate operations
        for (int i = 0; i < operations; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            int value = queries[i][2];

            differenceArray[left] += value;
            differenceArray[right + 1] -= value;
        }

        int currentSum = 0;

        // Check if all numbers can be made zero
        for (int i = 0; i < n; i++) {
            currentSum += differenceArray[i];
            if (currentSum < nums[i]) {
                return false; // Not possible to reduce nums[i] to zero
            }
        }

        return true;
    }
}
