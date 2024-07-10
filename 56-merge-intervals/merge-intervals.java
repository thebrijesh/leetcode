import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> mergedIntervals = new ArrayList<>();

        if (intervals != null && intervals.length != 0) {
            // Sort intervals by start time
            Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

            int start = intervals[0][0];
            int end = intervals[0][1];

            for (int[] interval : intervals) {
                if (interval[0] <= end) {
                    // Overlapping intervals, move the end if needed
                    end = Math.max(end, interval[1]);
                } else {
                    // Non-overlapping interval, add the previous interval and reset bounds
                    mergedIntervals.add(new int[]{start, end});
                    start = interval[0];
                    end = interval[1];
                }
            }
            // Add the last interval
            mergedIntervals.add(new int[]{start, end});
        }

        // Convert the list to an array
        return mergedIntervals.toArray(new int[0][]);
    }
}
