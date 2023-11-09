class Solution {
    public int differenceOfSums(int n, int m) {
        int sum1 = 0; int sum2 = 0;
    int totalSum = n *(n +1)/2;
    int divisible = n -(n % m);
    int value = divisible / m;
    int sum = value * (value + 1)/2 * m;  
       
        return totalSum - sum * 2;
    }
}