import java.util.*;
class Solution {
    static int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Solution obj = new Solution();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int val = sc.nextInt();

        int ans = removeElement(arr, val);
        System.out.print(ans);

    }
}