class Solution {
    // public boolean isSolvable(String[] words, String result) {
    // HashMap<Character, Integer> map = new HashMap<>();
    // String uniqueStr = "";
    // for (String str : words) {
    // for (int i = 0; i < str.length(); i++) {
    // char c = str.charAt(i);
    // if (!map.containsKey(c)) {
    // map.put(c, -1);
    // uniqueStr += c;
    // }
    // }

    // }
    // for (int i = 0; i < result.length(); i++) {
    // char c = result.charAt(i);
    // if (!map.containsKey(c)) {
    // map.put(c, -1);
    // uniqueStr += c;
    // }
    // }

    // boolean[] numbers = new boolean[10];
    // return helper(uniqueStr, 0, map, numbers, words, result);

    // }

    // public int getNumber(String str, HashMap<Character, Integer> map, int number)
    // {
    // for (int i = 0; i < str.length(); i++) {
    // char c = str.charAt(i);
    // number = number * 10 + map.get(c);

    // }

    // return number;
    // }

    // public boolean helper(String uniqueStr, int idx, HashMap<Character, Integer>
    // map,
    // boolean[] usedNumbers, String[] words, String results) {
    // if (idx == uniqueStr.length()) {

    // int number = 0;
    // int result = 0;
    // for (String str : words) {
    // number += getNumber(str, map, 0);
    // }

    // result = getNumber(results, map, 0);

    // if (number == result) {

    // return true;
    // } else {
    // return false;
    // }

    // }

    // for (int i = 0; i < 10; i++) {
    // if(i == 0 && idx == 0)continue;
    // char c = uniqueStr.charAt(idx);
    // if (usedNumbers[i] == false) {
    // map.put(c, i);
    // usedNumbers[i] = true;
    // if (helper(uniqueStr, idx + 1, map, usedNumbers, words, results))
    // return true;
    // map.put(c, -1);
    // usedNumbers[i] = false;
    // }

    // }

    // return false;
    // }
    private static final int[] POW_10 = new int[] { 1, 10, 100, 1000, 10000, 100000, 1000000 };

    public boolean isSolvable(String[] words, String result) {
        Set<Character> charSet = new HashSet<>();
        int[] charCount = new int[91];
        boolean[] nonLeadingZero = new boolean[91]; // ASCII of `A..Z` chars are in range `65..90`
        for (String word : words) {
            char[] cs = word.toCharArray();
            for (int i = 0; i < cs.length; i++) {
                if (i == 0 && cs.length > 1)
                    nonLeadingZero[cs[i]] = true;
                charSet.add(cs[i]);
                charCount[cs[i]] += POW_10[cs.length - i - 1]; // charCount is calculated by units
            }
        }
        char[] cs = result.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if (i == 0 && cs.length > 1)
                nonLeadingZero[cs[i]] = true;
            charSet.add(cs[i]);
            charCount[cs[i]] -= POW_10[cs.length - i - 1]; // charCount is calculated by units
        }
        boolean[] used = new boolean[10];
        char[] charList = new char[charSet.size()];
        int i = 0;
        for (char c : charSet)
            charList[i++] = c;
        return backtracking(used, charList, nonLeadingZero, 0, 0, charCount);
    }

    private boolean backtracking(boolean[] used, char[] charList, boolean[] nonLeadingZero, int step, int diff,
            int[] charCount) {
        if (step == charList.length)
            return diff == 0; // difference between sum of words and result equal to 0
        for (int d = 0; d <= 9; d++) { // each character is decoded as one digit (0 - 9).
            char c = charList[step];
            if (!used[d] // each different characters must map to different digits
                    && (d > 0 || !nonLeadingZero[c])) { // decoded as one number without leading zeros.
                used[d] = true;
                if (backtracking(used, charList, nonLeadingZero, step + 1, diff + charCount[c] * d, charCount))
                    return true;
                used[d] = false;
            }
        }
        return false;
    }

}