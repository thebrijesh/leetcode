class Solution {
    public int numSub(String s) {
        char st[] = s.toCharArray();


        long len = 0, ans = 0;
        char curr = '1';
        for(int i=0;i<st.length;i++){
            if(st[i]==curr){
                len++;
            }else{
                ans += ((len)*(len+1))/2;
                len = 0;
                
            }
        }
        ans += ((len)*(len+1))/2;

        return (int)(ans%(1000000000+7));

    }
}