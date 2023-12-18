public class Solution {
    int i = 0;
    public String decodeString(String s) {
        int num = 0;
        String currstr = "";
        StringBuilder str = new StringBuilder();

        for (; i < s.length(); ) {
            char curr = s.charAt(i);
            i++;
            if (curr >= '0' && curr <= '9') {
                num = num * 10 + curr - '0';

            } else if (curr == '[') {
                currstr = decodeString(s);
                while (num > 0) {
                    str.append(currstr);
                    num--;

                }

            } else if (curr == ']') {
                break;
            } else {
                str.append(curr);
            }


        }

        return str.toString();
    }
}