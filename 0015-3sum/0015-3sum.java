import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        int n = a.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(a); // Sorting is necessary to handle duplicates easily
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && a[i] == a[i - 1]) continue; // Skip duplicate elements
            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = a[i] + a[left] + a[right];
                if (sum == 0) {
                    ans.add(Arrays.asList(a[i], a[left], a[right]));
                    left++;
                    right--;
                    while (left < right && a[left] == a[left - 1]) left++; // Skip duplicates
                    while (left < right && a[right] == a[right + 1]) right--; // Skip duplicates
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ans;
    }
}
