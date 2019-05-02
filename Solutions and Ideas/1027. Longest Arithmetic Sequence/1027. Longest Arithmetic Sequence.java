class Solution {
    public int longestArithSeqLength(int[] A) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i = 0; i < A.length; i++){
            max = Math.max(max, A[i]);
            min = Math.min(min, A[i]);
        }
        int res = 0;
        int[][] dp = new int[A.length][max - min + 1];

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < max-min+1; j++){
                dp[i][j] = 1;
            }
        }

        for(int i = 1; i < A.length; i++){
            for(int j = i - 1; j >= 0; j--){
                int diff = A[i] - A[j];
                if(diff >= 0){
                    dp[i][diff] = Math.max(dp[i][diff], dp[j][diff] + 1);
                    res = Math.max(res, dp[i][diff]);
                }
            }
        }

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < max-min+1; j++){
                dp[i][j] = 1;
            }
        }

        for(int i = 1; i < A.length; i++){
            for(int j = i - 1; j >= 0; j--){
                int diff = A[i] - A[j];
                if(diff <= 0){
                    dp[i][-diff] = Math.max(dp[i][-diff], dp[j][-diff] + 1);
                    res = Math.max(res, dp[i][-diff]);
                }
            }
        }
        return res;
    }

}