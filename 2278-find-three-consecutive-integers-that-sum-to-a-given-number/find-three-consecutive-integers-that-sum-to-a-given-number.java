class Solution {
    public long[] sumOfThree(long num) {
        long[] arr = new long[3];
        long val = num/3;
        if(num % 3 == 0){
            arr[0] = val-1;
            arr[1] = val;
            arr[2] = val+1;
            return arr;
        }

        return new long[0];
    }
}