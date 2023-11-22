class Solution {
 public static boolean checkInclusion(String s1, String s2) {
     int n = s1.length();

        if (n > s2.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }

        for (int i = 0; i <= s2.length() - n; i++) {
            HashMap<Character, Integer> map2 = new HashMap<>(map);

            int j = 0;
            int k = i;

            while (j < s1.length()) {
                char charS1 = s1.charAt(j);
                char charS2 = s2.charAt(k);

                if (!map2.containsKey(charS2) || map2.get(charS2) == 0) {
                    break;
                }

                map2.put(charS2, map2.get(charS2) - 1);

                if (map2.get(charS2) == 0) {
                    map2.remove(charS2);
                }

                j++;
                k++;
            }

            if (j == s1.length()) {
                return true;
            }
        }

        return false;
    }
}