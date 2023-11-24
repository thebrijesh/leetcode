class Solution {
    public static int secondsToRemoveOccurrences(String s) {
        char[] ch = new char[s.length()];
        int count = 0;
        ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            boolean check = false;
            for (int j = 0; j < ch.length-1; j++) {
                if(ch[j] == '0' && ch[j+1] == '1'){
                    ch[j] = '1';
                    ch[j+1] = '0';
                    j+= 1;
                    check = true;
                }
            }
            if (check)count++;
            else return count;
        }
        return count;
    }
}