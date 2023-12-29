class Solution {
  public static int lengthOfLongestSubstring(String s) {
        char[] ch = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        int i = 0, j = 0, max = 0;

        while (i < ch.length) {
            if (!set.contains(ch[i])) {
                set.add(ch[i++]);
                max = Math.max(max, set.size());
            } else {
                set.remove(ch[j++]);
            }
            System.out.println(set);
        }

        return max;

    }
}