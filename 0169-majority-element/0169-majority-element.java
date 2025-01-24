class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int m = n/2;
        for(int i=0; i<n; i++){
            int c = 1;
            for(int j=i+1; j<n; j++){
                if(nums[i] == nums[j]){
                    c++;
                }
            }
            if(c>m){
                ans = nums[i];
            }
        }
        return ans;
    }
}