class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0; // No need for Integer.MIN_VALUE, as profit can't be negative
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // Update the minimum price
            } else {
                int diff = prices[i] - minPrice; // Calculate profit
                max = Math.max(max, diff); // Update max profit
            }
        }

        return max;
    }
}
