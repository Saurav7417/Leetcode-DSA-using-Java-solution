class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(nums[j]%2 == 0){
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
        return nums;
    }
}