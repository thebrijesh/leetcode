class Solution {
    public int leastInterval(char[] tasks, int n) {
        int arr[] = new int[27];
        for(int i = 0; i < tasks.length; i++){
            arr[tasks[i]-'A']++;
        }
        int max = -1;
        int count = 0;
        for(int i : arr){
            if( i > max){
                max = i;
                count = 1;
            }else if(max == i){
                count++;
            }
        }

        
        return Math.max(tasks.length, (max - 1) * (n+1) + count);
    }
}