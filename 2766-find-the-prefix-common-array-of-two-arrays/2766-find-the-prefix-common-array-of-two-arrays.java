class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n1 = A.length;
        int n2 = B.length;
        int[] C = new int[n1];
        
        for(int i=0; i<n1; i++){
            int count = 0;
            for(int j=0; j<=i; j++){
                for(int k=0; k<=i; k++){
                    if(A[j] == B[k]){
                        count++;
                        break;
                    }
                }
            }
            C[i] = count;
        }
        return C;
    }
}