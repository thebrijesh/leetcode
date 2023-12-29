class Solution {
  public static int lengthOfLongestSubstring(String s) {
        char[] ch = s.toCharArray();
        int n = s.length(), ans = 0;
        HashMap<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {

            if (map.containsKey(ch[j])) {
                i = Math.max(map.get(ch[j]), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(ch[j], j +1);
           
        }
        return ans;
    }
}