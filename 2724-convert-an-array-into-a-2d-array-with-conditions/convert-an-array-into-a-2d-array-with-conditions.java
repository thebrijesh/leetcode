class Solution {
public  List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        int max = 0;
        int freq[] = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            
            if (freq[nums[i]] >= list.size()) {
                list.add(new ArrayList<>());
            }
            list.get(freq[nums[i]]).add(nums[i]);
            freq[nums[i]]++;
        }
        return list;
    }
}