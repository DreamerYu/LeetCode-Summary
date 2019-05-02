class Solution {
    public int largestOverlap(int[][] A, int[][] B) {
        int n = A.length;

        int[] acor = new int[n*n], bcor = new int[n*n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(A[i][j] == 1) acor[i*n+j] = 1;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(B[i][j] == 1) bcor[i*n+j] = 1;
            }
        }
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n*n; i++){
            for(int j = 0; j < n*n; j++){
                if(acor[i] == 1 && bcor[j] == 1)
                    map.put(" "+(i/n-j/n)+" "+(i%n-j%n), map.getOrDefault(" "+(i/n-j/n)+" "+(i%n-j%n),0) + 1);
            }
        }
        int max = 0;
        for(int i : map.values()) max = Math.max(max, i);
        return max;

    }
}