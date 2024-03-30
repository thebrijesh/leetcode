class Solution {
    public String smallestNumber(String pattern) {
        int size = pattern.length();
        char arr[] =  new char[size+1];
        for(int i=0;i<=size;i++){
            arr[i] = Character.forDigit(i+1, 10);
        }
        for(int i =0;i<size;i++){
            int temp = i;
            while(temp < size && pattern.charAt(temp) == 'D'){
                temp++;   
            }
            reverse(arr, i , temp);
            if(i!= temp ) i = temp-1;

        }

        return new String(arr);
    }
    public void reverse(char arr[] , int i  , int j){
            while(i < j){
                char temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
                i++;
                j--;
            }  

    }
}