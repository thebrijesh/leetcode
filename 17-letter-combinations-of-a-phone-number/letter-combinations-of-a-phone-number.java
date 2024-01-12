class Solution {
    public List<String> letterCombinations(String digits) {
         List<String> list = new ArrayList<>();
        if (digits.isEmpty()) return list;
        Map<Character, String> mapping = new HashMap<>();
        mapping.put('2', "abc");
        mapping.put('3', "def");
        mapping.put('4', "ghi");
        mapping.put('5', "jkl");
        mapping.put('6', "mno");
        mapping.put('7', "pqrs");
        mapping.put('8', "tuv");
        mapping.put('9', "wxyz");
        StringBuilder str = new StringBuilder();
        letterCombinations(digits,0,mapping,str,list);
        return list;
    }

    public static void letterCombinations(String digits, int idx, Map<Character, String> map, StringBuilder str, List<String> list) {
        if (digits.length() == idx){
            list.add(str.toString());
            return;
        }
        char digit = digits.charAt(idx);
        String letters = map.get(digit);
        for (char letter:letters.toCharArray()) {
            str.append(letter);
            letterCombinations(digits,idx+1,map,str,list);
            str.deleteCharAt(str.length()-1);
        }
    }

}