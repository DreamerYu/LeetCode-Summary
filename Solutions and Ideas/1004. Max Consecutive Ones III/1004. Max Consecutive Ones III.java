class Solution {
    public int longestOnes(int[] A, int K) {
        int start = 0, end = 0;
        int res = 0;
        while(end < A.length){
            if(A[end] == 1){
                end++;
            }else{ //A[end] == 0
                if(K > 0){
                    K--;
                    end++;
                }else{
                    res = Math.max(res, end - start);
                    while(start <= end && K == 0){
                        if(A[start] == 0){
                            K++;
                        }
                        start++;
                    }
                }
            }
        }
        res = Math.max(res, end - start);
        return res;
    }
}