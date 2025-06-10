class Solution {

    /**
     * Rotates the given array to the right by k steps.
     *
     * @param nums The input array to rotate.
     * @param k Number of steps to rotate the array.
     */
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // In case k is greater than array length

        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);
        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Step 3: Reverse the remaining elements
        reverse(nums, k, n - 1);
    }

    /**
     * Reverses the elements of the array between the given indices.
     *
     * @param nums The array whose elements are to be reversed.
     * @param left The starting index of the range to reverse.
     * @param right The ending index of the range to reverse.
     */
    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
