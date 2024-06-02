class Solution {
    public String reverseVowels(String p) {
        char[] s = p.toCharArray();
        int start = 0;
        int end = s.length - 1;
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
         set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        while (start < end) {
            if (!set.contains(s[start])) {
                start++;
            }
            if (!set.contains(s[end])) {
                end--;
            }

            if (set.contains(s[start]) && set.contains(s[end])) {
                char temp = s[start];
                s[start] = s[end];
                s[end] = temp;
                start++;
                end--;
            }

        }

        return new String(s);
    }
}