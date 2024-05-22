class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        helper(s,list,new ArrayList<>());
        return list;
    }

    public void helper(String s,List<List<String>> ans, List<String> list){
        if(s.length() == 0){
            ans.add(new ArrayList(list) );
            return;
        }

        for(int i = 0; i < s.length(); i++){
            String pre = s.substring(0,i+1);
            String after = s.substring(i+1);
            if(isPalindrome(pre) ){
                list.add(pre);
                helper(after, ans, list);
                list.remove(list.size() - 1);

            }
        }
    }

    public boolean isPalindrome(String str){
        int start = 0;
        int end = str.length()-1;

        while(start < end){
            if(str.charAt(start) != str.charAt(end) ){
                return false;
            }
            start++;
            end--;
        }
        return true;
    } 
}