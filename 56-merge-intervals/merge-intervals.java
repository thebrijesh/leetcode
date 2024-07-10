import java.util.Arrays;
import java.util.LinkedList;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        // Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Use a LinkedList to store the merged intervals
        LinkedList<int[]> mergedIntervals = new LinkedList<>();

        // Initialize with the first interval
        mergedIntervals.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] lastInterval = mergedIntervals.getLast();
            int[] currentInterval = intervals[i];

            // Check if there is an overlap
            if (lastInterval[1] >= currentInterval[0]) {
                // Merge the intervals
                lastInterval[1] = Math.max(lastInterval[1], currentInterval[1]);
            } else {
                // No overlap, add the current interval to the list
                mergedIntervals.add(currentInterval);
            }
        }

        // Convert LinkedList to array
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
