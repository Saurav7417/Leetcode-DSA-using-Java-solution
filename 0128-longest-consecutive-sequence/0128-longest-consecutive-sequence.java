class Solution {
    public int longestConsecutive(int[] a) {
        int n = a.length;
        if(n==0) return 0;
        Arrays.sort(a);
        int l=1;
        int c=1;
        int pe=a[0];
        for(int i=0; i<n; i++){
            if(a[i]==pe) continue;
            else if(a[i]-1==pe){
                c++;
                pe=a[i];
            }
            else{
                l=Math.max(l,c);
                c=1;
                pe=a[i];
            }
        } 
        l=Math.max(l,c);       
        return l;
    }
}