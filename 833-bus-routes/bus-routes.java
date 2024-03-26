class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if(source == target)return 0;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < routes.length; i++) {
            for (int j = 0; j < routes[i].length; j++) {
                if (!map.containsKey(routes[i][j]))
                    map.put(routes[i][j], new ArrayList<>());

                List<Integer> list = map.get(routes[i][j]);
                list.add(i);
            }

        }
        if(!map.containsKey(source) || !map.containsKey(target))return -1;
        
        HashSet<Integer> busNo = new HashSet<>();
        HashSet<Integer> busStop = new HashSet<>();
        Queue<Integer> q = new ArrayDeque<>();
        int level = 0;
        q.add(source);
        busStop.add(source);

        while (q.size() > 0) {
            int size = q.size();

            while (size-- > 0) {
                int val = q.remove();
                if (val == target)
                    return level;
                List<Integer> buses = map.get(val);
                for (int bus : buses) {
                    if (busNo.contains(bus))
                        continue;
                    int arr[] = routes[bus];

                    for (int buss : arr) {
                        if (busStop.contains(buss))
                            continue;
                        q.add(buss);
                        busStop.add(buss);
                    }

                    busNo.add(bus);
                }
            }
            level++;
        }
        return -1;
    }
}