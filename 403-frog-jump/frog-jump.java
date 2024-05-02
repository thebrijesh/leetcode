class Solution {
    public boolean canCross(int[] stones) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();

        for (int num : stones) {
            map.put(num, new HashSet<>());
        }
        map.get(0).add(1);

        for (int i = 0; i < stones.length; i++) {
            HashSet<Integer> set = map.get(stones[i]);
            for (int val : set) {
                if (map.containsKey(val + stones[i])) {
                    HashSet<Integer> temp = map.get(val + stones[i]);
                    if (val > 1)
                        temp.add(val - 1);
                    temp.add(val);
                    temp.add(val + 1);

                }
            }
        }
        // System.out.println(map);
        return !map.get(stones[stones.length-1]).isEmpty();
    }
}