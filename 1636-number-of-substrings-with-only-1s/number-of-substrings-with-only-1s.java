class Solution {
    public int numSub(String s) {
        char st[] = s.toCharArray();


        long size = 0, ans = 0;
        char curr = '1';
        for(int i=0;i<st.length;i++){
            if(st[i]==curr){
                size++;
            }else{
                ans += ((size)*(size+1))/2;
                size = 0;
                
            }
        }
        ans += ((size)*(size+1))/2;

        return (int)(ans%(1000000000+7));

    }
}