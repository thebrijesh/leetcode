class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int min = Integer.MAX_VALUE;
        for (int t : time) {
            min = Math.min(min, t);
        }

        long start = min;
        long end = (long) min * totalTrips;

        while (start < end) {
            long mid = start + (end - start) / 2;

            if (isEnough(mid, time, totalTrips)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    private boolean isEnough(long elapsed, int[] times, int totalTrips) {
        long res = 0;

        for (int time : times) {
            res += (long) ((double) elapsed / time);

            if (res >= totalTrips) {
                return true;
            }
        }

        return false;
    }
}