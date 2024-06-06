class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> chMap = new HashMap<>();
        HashMap<String, Character> strMap = new HashMap<>();
        int j = 0;
        for(int i = 0; i < pattern.length(); i++){
            if(j >= s.length())return false;
            char ch = pattern.charAt(i);
            StringBuilder str = new StringBuilder();
            while(j < s.length() && s.charAt(j) != ' '){
                str.append(s.charAt(j++));
            }
            j++;
            
            if(!chMap.containsKey(ch) && !strMap.containsKey(str.toString())){
                chMap.put(ch,str.toString());
                strMap.put(str.toString(),ch);
            }else if(chMap.containsKey(ch) && strMap.containsKey(str.toString())){
                String st = chMap.get(ch);
                if(!str.toString().equals(st) )return false;
            }else{
                return false;
            }


        }
            if(j < s.length())return false;        

        return true;
    }
}