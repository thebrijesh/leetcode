class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int count = 0;
        for(var str : operations){
            if(str.contains("++"))count++;
            else count--;
        }
        return count;
    }
}