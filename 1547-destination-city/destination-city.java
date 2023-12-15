class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> map = new HashMap();
        for(int i = 0; i<paths.size(); i++){
            map.put(paths.get(i).get(0),paths.get(i).get(1));
        }
        for(int i = 0; i < paths.size(); i++){
            if(!map.containsKey(paths.get(i).get(1))){
                return paths.get(i).get(1);
            }
        }
    return "";
    }
}