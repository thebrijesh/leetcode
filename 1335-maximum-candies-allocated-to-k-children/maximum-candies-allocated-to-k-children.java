class Solution {

    /**
     * Checks whether it is possible to distribute 'val' candies to at least 'm' children.
     *
     * @param candies Array of available candies
     * @param candiesPerChild Number of candies to distribute per child
     * @param numChildren Number of children to be served
     * @return true if distribution is possible, false otherwise
     */
    private boolean canDistributeCandies(int[] candies, int candiesPerChild, long numChildren) {
        long childrenServed = 0;
        for (int candy : candies) {
            // Calculate how many children can be served from the current candy pile
            childrenServed += candy / candiesPerChild;
        }
        return childrenServed >= numChildren;
    }

    /**
     * Finds the maximum number of candies that can be distributed equally among k children.
     *
     * @param candies Array of available candies
     * @param k Number of children
     * @return Maximum number of candies each child can get
     */
    public int maximumCandies(int[] candies, long k) {
        long totalCandies = 0;
        int minCandiesPerChild = 1;

        // Calculate the total number of candies
        for (int candy : candies) {
            totalCandies += candy;
        }

        // If the total candies are less than the required number of children, return 0
        if (totalCandies < k) {
            return 0;
        }

        int maxCandiesPerChild = (int) (totalCandies / k); // Maximum possible candies per child

        // Binary search to find the maximum number of candies per child
        while (minCandiesPerChild <= maxCandiesPerChild) {
            int midCandiesPerChild = minCandiesPerChild + (maxCandiesPerChild - minCandiesPerChild) / 2;

            // Check if it is possible to distribute midCandiesPerChild to all children
            if (canDistributeCandies(candies, midCandiesPerChild, k)) {
                minCandiesPerChild = midCandiesPerChild + 1;  // Try for a higher value
            } else {
                maxCandiesPerChild = midCandiesPerChild - 1;  // Try for a lower value
            }
        }

        return maxCandiesPerChild;
    }
}
