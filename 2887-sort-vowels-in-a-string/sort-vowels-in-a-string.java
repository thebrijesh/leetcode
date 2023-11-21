class Solution {
    public static String sortVowels(String s) {
        int[] arr = new int[10];
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'A') arr[0]++;
            else if (s.charAt(i) == 'A') arr[0]++;
            else if (s.charAt(i) == 'E') arr[1]++;
            else if (s.charAt(i) == 'I') arr[2]++;
            else if (s.charAt(i) == 'O') arr[3]++;
            else if (s.charAt(i) == 'U') arr[4]++;
            else if (s.charAt(i) == 'a') arr[5]++;
            else if (s.charAt(i) == 'e') arr[6]++;
            else if (s.charAt(i) == 'i') arr[7]++;
            else if (s.charAt(i) == 'o') arr[8]++;
            else if (s.charAt(i) == 'u') arr[9]++;

        }

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) ==    'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'|| s.charAt(i) == 'u'){
                if(arr[0]>0){
                    str.append('A');
                    arr[0]--;
                }else if (arr[1] > 0) {
                    str.append('E');
                    arr[1]--;
                }else if (arr[2] > 0) {
                    str.append('I');
                    arr[2]--;
                }else if (arr[3] > 0) {
                    str.append('O');
                    arr[3]--;
                }else if (arr[4] > 0) {
                    str.append('U');
                    arr[4]--;
                }else if (arr[5] > 0) {
                    str.append('a');
                    arr[5]--;
                }else if (arr[6] > 0) {
                    str.append('e');
                    arr[6]--;
                }else if (arr[7] > 0) {
                    str.append('i');
                    arr[7]--;
                }else if (arr[8] > 0) {
                    str.append('o');
                    arr[8]--;
                }else if (arr[9] > 0) {
                    str.append('u');
                    arr[9]--;
                }

            }else {
                str.append(s.charAt(i));
            }
        }
        System.out.println(str.toString());
        return str.toString();
    }
}