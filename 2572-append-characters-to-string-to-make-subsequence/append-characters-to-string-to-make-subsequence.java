class Solution {
    public int appendCharacters(String s, String t) {
        int j = 0;
        int i = 0;
        while (i < s.length() && j < t.length()) {

            char schar = s.charAt(i);
            char tchar = t.charAt(j);

            if (schar == tchar) {

                j++;
            }
            i++;

        }

        return t.length() - j;
    }
}