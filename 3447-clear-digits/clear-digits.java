class Solution {
    public String clearDigits(String s) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                str.deleteCharAt(str.length() - 1);
            } else {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}