// class Solution {
//     public List<List<Integer>> generate(int n) {
//         List<List<Integer>> result = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             List<Integer> row = new ArrayList<>();
//             row.add(1);
//             for (int j = 1; j < i; j++) {
//                 row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
//             }
//             if (i > 0) row.add(1);
//             result.add(row);
//         }
//         return result;        
//     }
// }


class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=1; j<i; j++){
                row.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }
            if(i>0) row.add(1);
            result.add(row);
        }
        return result;
}
}
