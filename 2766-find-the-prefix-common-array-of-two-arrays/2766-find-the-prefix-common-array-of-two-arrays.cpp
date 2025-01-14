class Solution {
public:
    vector<int> findThePrefixCommonArray(vector<int>& nums1, vector<int>& nums2) {
        unordered_map<int,int>mpp;
        int c=0;
        vector<int> ans;
        for(int i=0;i<nums2.size();i++){
            mpp[nums1[i]]++;
            if(mpp[nums1[i]]==2) c++;
            mpp[nums2[i]]++;
            if(mpp[nums2[i]]==2) c++;
            ans.push_back(c);
        }
        return ans;
    }
};