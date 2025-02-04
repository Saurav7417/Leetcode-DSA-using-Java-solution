class Solution {
    public int maxAscendingSum(int[] a) {
        int n = a.length;
        int sum = a[0];
        int currSum = a[0];
        for(int i=1; i<n; i++){
            if(a[i]>a[i-1]){
                currSum += a[i];
                sum = Math.max(sum,currSum);
            }
            else{
                currSum = 0;
                currSum += a[i];
            }
            
        }
        sum = Math.max(sum,currSum);
        return sum;
    }
}