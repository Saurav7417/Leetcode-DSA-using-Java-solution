import java.util.HashMap;

class Solution {

    static int SOD(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;        
    }

    public int maximumSum(int[] a) {
        int ans = -1;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : a) {
            int sod = SOD(num);
            if (map.containsKey(sod)) {
                ans = Math.max(ans, map.get(sod) + num);
            }
            map.put(sod, Math.max(map.getOrDefault(sod, 0), num));
        }
        return ans;
    }
}
