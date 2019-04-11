class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        int[] set = new int[6];
        for(int i = 0; i < A.length; i++){
            set[A[i] - 1]++;
            set[B[i] - 1]++;
        }

        int max = 0, index = 0;
        for(int i = 0; i < 6; i++){
            if(max < set[i]){
                max = set[i];
                index = i;
            }
        }

        if(max < A.length) return -1;
        int an = 0, bn = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] == index + 1 || B[i] == index + 1){
                if(A[i] == index + 1) an++;
                if(B[i] == index + 1) bn++;
                if(A[i] == index + 1 && B[i] == index + 1){
                    an--;
                    bn--;
                }
            }else return -1;
        }
        return an > bn ? bn : an;
    }
}