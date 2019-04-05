class Solution {
    public int maxScoreSightseeingPair(int[] A) {
        if(A == null || A.length == 0) return 0;
        int res = 0, cur = 0;
        for(int i = 0; i < A.length; i++){
            res = Math.max(res, cur + A[i]);
            cur = Math.max(cur, A[i]) - 1;
        }
        return res;
    }
}