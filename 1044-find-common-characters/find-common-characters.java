class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < words[0].length(); i++) {
            char ch = words[0].charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 1; i < words.length; i++) {
            map1 = new HashMap<>();
            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                map1.put(ch, map1.getOrDefault(ch, 0) + 1);
            }
            int min = Integer.MAX_VALUE;

            for (char ch : map.keySet()) {
                if (map1.containsKey(ch)) {

                    min = Math.min(map.get(ch), map1.get(ch));
                    map.put(ch, min);
                }else{
                    map.put(ch, 0); 
                }
            }
        }

        for (char chs : map.keySet()) {
            int nums = map.get(chs);
            for (int i = 0; i < nums; i++) {
                
                list.add(String.valueOf(chs));
            }

        }

        return list;
    }
}