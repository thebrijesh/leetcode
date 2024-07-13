class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {

        List<int[]> temp = new ArrayList<>();
        int countr = 0;
        int countl = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<positions.length; i++){
            temp.add(new int[]{positions[i],healths[i],(int)directions.charAt(i)});
            map.put(positions[i],healths[i]);
            if(directions.charAt(i) == 'R'){
                countr++;
            }else{
                countl++;
            }
        }
        Collections.sort(temp,Comparator.comparingInt(o -> o[0]));
        
        for(int i=1; i<temp.size(); i++){
             if(i == 0) continue;
             if(temp.get(i)[2] == 'L' && temp.get(i-1)[2] == 'R'){
                  if(Objects.equals(map.get(temp.get(i)[0]), map.get(temp.get(i - 1)[0]))){
                      map.remove(temp.get(i)[0]);
                      map.remove(temp.get(i-1)[0]);
                      temp.remove(i);
                      temp.remove(i-1);
                      i-=2;
                  }else if(map.get(temp.get(i)[0]) > map.get(temp.get(i-1)[0])){
                     map.remove(temp.get(i-1)[0]);
                     map.put(temp.get(i)[0],map.get(temp.get(i)[0])-1);
                     temp.remove(i-1);
                     i-=2;
                  }else{
                      map.remove(temp.get(i)[0]);
                     map.put(temp.get(i-1)[0],map.get(temp.get(i-1)[0])-1);
                     temp.remove(i);
                     i--;
                  }
             }
        }

        List<Integer> ans = new ArrayList<>();
        for(int i : positions){
            if(map.containsKey(i)){
                ans.add(map.get(i));
            }
        }
        
        return ans;
    }
}