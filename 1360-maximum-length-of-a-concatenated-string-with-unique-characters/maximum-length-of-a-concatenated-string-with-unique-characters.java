class Solution {
    public int maxLength(List<String> arr) {
        return maxLength(arr,"",0);
    }

        public  int maxLength(List<String> arr, String str, int idx) {
        if (idx >= arr.size()) {

            return str.length();
        }


            int a = 0;
            int b = 0;
            if (checkDupli(str, arr.get(idx))) {

                a = maxLength(arr,str+arr.get(idx),idx+1);
            }

           b = maxLength(arr, str, idx + 1);


        return Math.max(a,b);
    }

    public  boolean checkDupli(String str, String st) {
        HashSet<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        for (char c : st.toCharArray()) {
            if (set.contains(c)) {
                return false;
            } else {
                set.add(c);
            }
        }

        return true;
    }
}