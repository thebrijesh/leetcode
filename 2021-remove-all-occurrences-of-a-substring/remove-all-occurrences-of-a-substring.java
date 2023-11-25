class Solution {
    public static String removeOccurrences(String s, String part) {
        StringBuilder stringBuilder = new StringBuilder(s);
        int start = -1;
        char[] ch1 = part.toCharArray();
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == ch1[0]){
                start = i;
                break;
            }
        }
        if (start == -1)return s;

        while (start != -1){
            int j = start;
            int k = 0;
            while (j < stringBuilder.length() && k < ch1.length && stringBuilder.charAt(j) == ch1[k] ){
                j++;
                k++;
            }
            if(k == part.length()){
                stringBuilder.delete(start,j);
                start = -1;
                for (int i = 0; i < stringBuilder.length(); i++) {
                    if (stringBuilder.charAt(i) == ch1[0]){
                        start = i;
                        break;
                    }
                }
            }else {
                int s1 = start;
                start = -1;
                for (int i = s1+1; i < stringBuilder.length(); i++) {
                    if (stringBuilder.charAt(i) == ch1[0]){
                        start = i;
                        break;
                    }
                }
            }
        }


        return stringBuilder.toString();
    }
}