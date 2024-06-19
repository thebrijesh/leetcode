class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < ((long)m)*((long)k)) return -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : bloomDay){
            max = Math.max(max,i);
            min = Math.min(min,i);
        }
        int start = min;
        int end = max;

        while(start < end){
            int mid = start + (end -start)/2;

            int tbouq = 0;
            int cnt = 0;
            for(int i : bloomDay){
                if(i <= mid){
                    cnt++;
                }else{
                    tbouq += (cnt/k);
                    cnt = 0;
                }
            }
            tbouq += (cnt/k);
            if(tbouq >= m){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return end;
    }
}