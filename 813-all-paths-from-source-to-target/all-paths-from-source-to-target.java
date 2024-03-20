class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> list = new ArrayList<>();
        fun( 0, graph.length-1, list,graph);
        return ans;
    }
    public void fun(int s, int d, List<Integer> list, int[][] graph){
        list.add(s);
        if(s == d){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i : graph[s]){
            fun(i,d,list, graph);
            list.remove(list.size()-1);
        }

        
    }
}