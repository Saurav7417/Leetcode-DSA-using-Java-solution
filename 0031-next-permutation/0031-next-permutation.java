class Solution {
    public void nextPermutation(int[] a) {
        int n = a.length;
        int idx = -1;
        for(int i=n-2; i>=0; i--){
            if(a[i] < a[i+1]){
                idx = i;
                break;
            }
        }

        if(idx!=-1){
            for(int i=n-1; i>idx; i--){
            if(a[i]>a[idx]){
                int temp = a[i];
                a[i] = a[idx]; 
                a[idx] = temp;
                break;
            }
        }
        }

        int i = idx+1, j=n-1;
        while(i<j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
}