class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int m = 0;
        int h = nums.length - 1;

        while (m <= h) {
            if (nums[m] == 0) {
                swap(nums,l, m);
                l++;
                m++;
            } else if (nums[m] == 1) {
                m++;
            } else if (nums[m] == 2) {
                swap(nums,m, h);
                h--;
            }

        }

    }

    public void swap(int[] nums, int i, int j) {
        final int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}