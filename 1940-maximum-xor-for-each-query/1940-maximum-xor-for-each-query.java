class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        // just xor with value k
        int k = (int) Math.pow(2, maximumBit) - 1, n = nums.length;
        int ans[] = new int[n];
        for(int i = 0; i<n; i++){
            // now perform xor with ans
            k ^= nums[i];
            ans[n - 1 - i] = k;
        }
        return ans;
    }
}