class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        combine(list,new ArrayList<>(),1,n,k);
        return list;
    }

    public void combine(List<List<Integer>> list,List<Integer> comb, int start,int n,int k){
        if(k == 0){
            list.add(new ArrayList<>(comb));
            return;
        }

        for(int i = start; i <= n; i++){
            comb.add(i);
            combine(list,comb,i+1,n,k-1);
            comb.remove(comb.size()-1);
        }
    }

}