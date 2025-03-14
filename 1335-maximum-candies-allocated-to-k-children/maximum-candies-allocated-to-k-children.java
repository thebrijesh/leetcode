class Solution {

    private static final int MAX_CANDIES = 10_000_000;

    /**
     * Finds the maximum number of candies that can be distributed equally among k children.
     *
     * @param candies Array of available candies
     * @param k The number of children
     * @return Maximum number of candies each child can get
     */
    public int maximumCandies(int[] candies, long k) {
        int left = 1;
        int right = MAX_CANDIES;
        int maxCandiesPerChild = 0;

        // Binary search to find the optimal number of candies per child
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Calculate the number of children that can be served with the current mid value
            long childrenCount = calculateChildrenCount(candies, mid);

            // If we can serve at least k children, try to increase candies per child
            if (childrenCount >= k) {
                maxCandiesPerChild = mid;
                left = mid + 1;
            } else {
                // Otherwise, reduce the number of candies per child
                right = mid - 1;
            }
        }

        return maxCandiesPerChild;
    }

    /**
     * Calculates the number of children that can be served with the given number of candies per child.
     *
     * @param candies Array of available candies
     * @param candiesPerChild The number of candies to give to each child
     * @return The number of children that can be served
     */
    private long calculateChildrenCount(int[] candies, int candiesPerChild) {
        long childrenCount = 0;
        for (int candy : candies) {
            childrenCount += candy / candiesPerChild;
        }
        return childrenCount;
    }
}
