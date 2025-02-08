class Solution {
    public List<Integer> majorityElement(int[] a) {
        int n = a.length;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > (n / 3) && !ans.contains(a[i])) {
                ans.add(a[i]);
            }
        }
        return ans;
    }
}
