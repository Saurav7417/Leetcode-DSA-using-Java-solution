class Solution {
public:
    int firstCompleteIndex(vector<int>& arr, vector<vector<int>>& mat) {
        int n=mat.size();
        int m=mat[0].size();
        unordered_map<int,vector<int>> mpp;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mpp[mat[i][j]]={i,j};
            }
        }
        vector<int> rows(n,m);
        vector<int> cols(m,n);
        for(int i=0;i<arr.size();i++){
            int r=mpp[arr[i]][0];
            int c=mpp[arr[i]][1];
            rows[r]--;
            cols[c]--;
            if(rows[r]==0 || cols[c]==0) return i;
     }
     return 0;
    }
};