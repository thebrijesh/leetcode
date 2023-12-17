class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0)return false;
        if(n==1)return true;
        return 1073741824%n==0 && (n+2)%6==0;
    }
}