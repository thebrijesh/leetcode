class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            while (i+1 != nums[i]) {
                if(nums[i] == 0)break;
                int j = nums[i];
                int k = nums[j - 1];
                if(j == k){
                    list.add(nums[i]);
                    nums[i] = 0;
                    break;
                }
                int temp = j;
                nums[i] = k;
                nums[j-1] = temp;
                
            }

        }
        return list;
    }
}