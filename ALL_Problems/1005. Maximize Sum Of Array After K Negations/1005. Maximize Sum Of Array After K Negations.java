class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        if(A == null || A.length == 0) return 0;
        Arrays.sort(A);

        for(int i = 0; i < A.length; i++){
            if(A[i] < 0 && K > 0){
                A[i] = -A[i];
                K--;
            }
        }
        Arrays.sort(A);
        int sum = 0;
        for(int i = A.length - 1; i > 0; i--) sum += A[i];
        return sum + (K % 2 == 0 ? A[0] : -A[0]);

    }
}