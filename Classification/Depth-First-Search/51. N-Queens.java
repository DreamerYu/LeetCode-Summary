class Solution {
    HashSet<Integer> cols = new HashSet<>();
    HashSet<Integer> diag1 = new HashSet<>();
    HashSet<Integer> diag2 = new HashSet<>();
    List<List<String>> res;
    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }

        dfs(board, 0, n);
        return res;

    }

    public void dfs(char[][] board, int row, int n){

        for(int i = 0; i < n; i++){
            if(!cols.contains(i)){
                cols.add(i);
                if(!diag1.contains(i - row)){
                    diag1.add(i - row);
                    if(!diag2.contains(i+row)){
                        diag2.add(i+row);
                        board[row][i] = 'Q';
                        if(row == n - 1){
                            construct(board);
                        }else{
                            dfs(board, row+1, n);
                        }
                        board[row][i] = '.';
                        diag2.remove(i+row);
                    }
                    diag1.remove(i - row);
                }
                cols.remove(i);
            }
        }
    }

    public void construct(char[][] board){
        List<String> list = new LinkedList<String>();
        for(int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            list.add(s);
        }
        res.add(new ArrayList<>(list));
    }
}