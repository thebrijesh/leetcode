class Solution {
    public int[] getStrongest(int[] nums, int p) {
        Arrays.sort(nums);
        System.out.print(Arrays.toString(nums));
        int[] ans = new int[p];
        int n = nums.length;
        int mid = nums[(n - 1) / 2];

        int i = 0;
        int j = n - 1;
        int k = 0;
        while (k < p ) {
            int val1 = mid- nums[i];
            int val2 = nums[j] - mid;

            if (val1 == val2) {
                
                if (nums[i] > nums[j]) {
                    ans[k++] = nums[i];
                    i++;
                } else {
                    ans[k++] = nums[j];
                    j--;
                }
            } else {
                if (  val1 > val2) {
                    ans[k++] = nums[i];
                    i++;
                } else {
                    ans[k++] = nums[j];
                    j--;
                }
            }
        }
        return ans;
    }
}