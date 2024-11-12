import java.util.*;

class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        TreeMap<Integer, Integer> m = new TreeMap<>();
        for (int[] item : items) {
            m.put(item[0], Math.max(m.isEmpty() ? 0 : m.lastEntry().getValue(), item[1]));
        }
        return Arrays.stream(queries).map(q -> m.floorEntry(q) == null ? 0 : m.floorEntry(q).getValue()).toArray();
    }
}