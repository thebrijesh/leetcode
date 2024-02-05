class Solution {
    public int firstUniqChar(String s) {
        int min = Integer.MAX_VALUE;

        for (char i = 'a'; i <= 'z'; i++) {
            int index = s.indexOf(i);
            if (index != -1 && index == s.lastIndexOf(i)) {

                min = Math.min(min, index);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}