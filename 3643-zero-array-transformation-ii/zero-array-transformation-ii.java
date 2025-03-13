class Solution {

    /**
     * Finds the minimum number of queries required to make the entire array zero.
     * Uses the prefix sum and difference array technique for efficient range updates.
     * 
     * @param nums the array of initial values
     * @param queries a 2D array of queries where each query contains [left, right, value]
     * @return the minimum number of queries required, or -1 if not possible
     */
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int prefixSum = 0;  // Tracks the cumulative sum of updates
        int usedQueries = 0;  // Counts the number of used queries

        // Difference array for efficient range updates
        int[] differenceArray = new int[n + 1];

        // Iterate through each element in the nums array
        for (int index = 0; index < n; index++) {
            // While the effective value at index is less than the required nums[index]
            while (prefixSum + differenceArray[index] < nums[index]) {
                usedQueries++;  // Increment the count of used queries

                // If all queries are exhausted and nums[index] is not zero, return -1
                if (usedQueries > queries.length) {
                    return -1;
                }

                // Extract query details: left boundary, right boundary, and value to add
                int left = queries[usedQueries - 1][0];
                int right = queries[usedQueries - 1][1];
                int value = queries[usedQueries - 1][2];

                // Apply range update using the difference array technique
                if (right >= index) {
                    // Update the difference array at the effective left boundary
                    differenceArray[Math.max(left, index)] += value;

                    // Stop the effect after the right boundary
                    differenceArray[right + 1] -= value;
                }
            }

            // Update the cumulative prefix sum at the current index
            prefixSum += differenceArray[index];
        }

        return usedQueries;  // Return the minimum number of queries required
    }
}
