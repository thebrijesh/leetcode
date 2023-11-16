class Solution {
    public static List<List<Integer>> groupThePeople(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int count = 0;
            int j = i;
            List<Integer> list = new ArrayList<>();
            while (count < nums[i] && j < nums.length) {
                if (!map.containsKey(j) && nums[i] == nums[j]) {
                    map.put(j,nums[j]);
                    list.add(j);
                    count++;

                }

                j++;
            }

            if(!list.isEmpty()) lists.add(list);
        }

      

        return lists;
    }
}