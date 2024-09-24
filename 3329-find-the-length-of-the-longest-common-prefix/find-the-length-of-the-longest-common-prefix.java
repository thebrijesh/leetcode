class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> set = new HashSet<>();

        for(int val : arr1){
            String str = String.valueOf(val);
            for(int i = 0; i < str.length(); i++){
                set.add(str.substring(0,i+1));
            }
        }
        int ans = 0;
        for(int val : arr2){
            String str = String.valueOf(val);
            for(int i = 0; i < str.length(); i++){
                String st = str.substring(0,i+1);
                if(set.contains(st)){
                    ans = Math.max(ans,st.length());
                }
            }
        }

        
        return ans;
    }
}