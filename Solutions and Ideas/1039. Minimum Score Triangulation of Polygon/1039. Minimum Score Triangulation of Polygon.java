class Solution {
    // dp
    public int minScoreTriangulation(int[] A) {
        int n = A.length;
        int[][] dp = new int[n][n];
        for(int d = 2; d < n; d++){
            for(int i = 0; i+d < n; i++){
                int j = i + d;
                dp[i][j] = Integer.MAX_VALUE;
                for(int k = i + 1; k < j; k++){
                    dp[i][j] = Math.min(dp[i][j], dp[i][k]+dp[k][j]+A[i]*A[j]*A[k]);
                }
            }
        }
        return dp[0][n-1];
    }

    // dfs, TLE
//     HashMap<String, Integer> map = new HashMap<>();
//     public int minScoreTriangulation(int[] A) {
//         List<Integer> a = new ArrayList<>();
//         for(int i = 0; i < A.length; i++) a.add(A[i]);
//         return dfs(a, 0);
//     }

//     public int dfs(List<Integer> list, int sum){
//         int min = Integer.MAX_VALUE;
//         String key = "";
//         for(int i = 0; i < list.size(); i++){
//             key += list.get(i) + ",";
//         }
//         if(map.containsKey(key)) return map.get(key);
//         if(list.size() == 3){
//             sum = list.get(0)*list.get(1)*list.get(2);
//             map.put(key, sum);
//             return sum;
//         }

//         for(int i = 0; i < list.size()-2; i++){
//             int incre = list.get(i)*list.get(i+1)*list.get(i+2);
//             sum += incre;
//             int temp = list.remove(i+1);
//             min = Math.min(min, incre + dfs(list, sum));
//             // System.out.println(min);
//             list.add(i+1, temp);
//             sum -= incre;
//         }
//         map.put(key, min);
//         return map.get(key);
//     }
}