class Solution {
    int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0,-1}};
    public int numEnclaves(int[][] A) {
        int m = A.length, n = A[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(A[i][j] == 1 && ((i == 0 || i == m - 1) || (j == 0 || j == n - 1))){
                    dfs(A, i, j);
                }
            }
        }
        int res = 0;
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                if(A[i][j] == 1){
                    res++;
                }
            }
        }
        return res;
    }

    public void dfs(int[][] A, int x, int y){
        A[x][y] = 0;
        for(int[] dir : dirs){
            int newx = x + dir[0];
            int newy = y + dir[1];
            if(newx >= 0 && newx < A.length && newy >= 0 && newy < A[0].length && A[newx][newy] == 1){
                dfs(A,newx,newy);
            }
        }
    }
}