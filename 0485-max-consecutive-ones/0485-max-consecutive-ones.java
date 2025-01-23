class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int currans = 0;
        for(int i=0; i<n; i++){
            if(nums[i]==1){
                currans++;
                ans = Math.max(ans, currans);
            } else if(nums[i]==0){
                currans = 0;
            }
        }
        return ans;
    }
}