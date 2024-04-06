class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] arr = s.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (ch == '(') {
                count++;
            } else if(ch == ')') {
                if (count == 0)
                    arr[i] = '0';
                else
                    count--;
            }
        }

        for(int i = arr.length-1; i>=0; i--){
            if(count > 0 && arr[i] == '('){
                arr[i] = '0';
                count--;
            }
        }

        StringBuilder str = new StringBuilder();
        for(char ch : arr){
            if(ch != '0')str.append(ch);
        }
        return str.toString();
    }
}