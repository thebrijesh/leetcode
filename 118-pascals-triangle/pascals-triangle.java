import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();  // This will store the final result
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();  // This will store each row
            int n = 1;  // The first value in each row is always 1
            
            for (int j = 0; j <= i; j++) {
                list.add(n);  // Add the current value to the list
                n = n * (i - j) / (j + 1);  // Compute the next value in the row
            }
            
            res.add(list);  // Add the completed row to the result
        }
        
        return res;  
    }
}