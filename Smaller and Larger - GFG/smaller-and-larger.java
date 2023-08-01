//{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans[] = new Solve().getMoreAndLess(arr, n, x);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}


// } Driver Code Ends


//User function Template for Java




class Solve {
    int[] getMoreAndLess(int[] arr, int n, int x) {
        int start =0; int end =n-1; int fo = 0;
         int start1 =0; int end1 =n-1; int lo = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==x){
                fo = mid;
                end = mid-1;
            }
            else if(arr[mid]>x){
                end = mid-1; 
            }else{
                start = mid +1;
            }
        }
        while(start1<=end1){
            int mid = start1 + (end1-start1)/2;
            if(arr[mid]==x){
                lo = mid;
                start1 = mid+1;
            }
            else if(arr[mid]>x){
                end1 = mid-1; 
            }else{
                start1 = mid +1;
            }
        }
        
        
        if(fo==0){
            fo = end+1;
        }
        if(lo == 0){
            lo = end1;
        }
        
        int [] ans = new int[2];
        ans[0] = lo+1;
        ans[1] = n-fo;
      return ans; 
    }
}