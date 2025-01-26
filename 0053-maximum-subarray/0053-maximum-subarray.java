class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = Integer.MIN_VALUE; // Initialize with the smallest value
        int currentSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum += nums[i];
            sum = Math.max(sum, currentSum); // Update the max sum
            if (currentSum < 0) {
                currentSum = 0; // Reset current sum if it goes negative
            }
        }

        return sum;
    }
}
