class Solution {
    public int subarraySum(int[] a, int k) {
        int n = a.length;
        int c = 0;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += a[j];
                if(sum == k){
                    c++;
                }
            }
        }
        return c;
    }
}