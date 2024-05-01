class Solution {
    public String reversePrefix(String word, char ch) {
        char[] chars = word.toCharArray();

        int chIndex = -1;
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == ch) {
                chIndex = i;
                break;
            }
        }

        int start = 0;
        int end = chIndex;
        while(start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }

        return new String(chars);
    }
}