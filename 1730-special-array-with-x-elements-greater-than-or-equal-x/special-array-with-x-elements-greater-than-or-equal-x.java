class Solution {
    public int countPossibility(int []nums,int x){
        int cnt=0;
        for(int n:nums) if(n>=x) cnt++;
        return cnt;
    }
    public int specialArray(int[] nums) {
        int maxi=Integer.MIN_VALUE,start=1,mid=0;
        for(int x:nums) maxi=Math.max(maxi,x);
        int end = maxi;
        while(start<=end){
            mid = (start+end)/2;
            int check = countPossibility(nums,mid);
            if(check==mid) return mid;
            if(mid<check) start=mid+1;
            else end=mid-1;
        }
        return -1;
    }
}