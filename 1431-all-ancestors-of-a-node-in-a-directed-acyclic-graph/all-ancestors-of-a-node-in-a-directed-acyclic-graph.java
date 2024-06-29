class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] indgree = new int[n];

        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < edges.length; i++){
            indgree[edges[i][1]]++;
            graph.get(edges[i][0]).add(edges[i][1]);
        }

        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0; i < indgree.length; i++){
            if(indgree[i] == 0){
                q.add(i);
            }
        }

        List<HashSet<Integer>> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list.add(new HashSet<>());
        }

        while(!q.isEmpty()){
            int temp = q.remove();
            List<Integer> glist  = graph.get(temp);
            for(int i = 0; i < glist.size(); i++){
                list.get(glist.get(i)).add(temp);
                list.get(glist.get(i)).addAll(list.get(temp));

                if(--indgree[glist.get(i)] == 0)q.add(glist.get(i));
            }
        
        }
        
        for(int i = 0; i < graph.size(); i++){
            List<Integer> l = new ArrayList<>(list.get(i));
            Collections.sort(l);
            graph.set(i,l);
        }

        return graph;
    }
}