class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] temp =  strs[i].toCharArray();
            Arrays.sort(temp);
            String sort = new String(temp);
            if(!map.containsKey(sort)) {
                map.put(sort,new ArrayList<>());
            }
             map.get(sort).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}