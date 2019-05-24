class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    public boolean solve(char[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == '.'){
                    for(char ch = '1'; ch <= '9'; ch++){
                        if(valid(board, i, j, ch)){
                            board[i][j] = ch;
                            if(solve(board)){
                                return true;
                            }
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public boolean valid(char[][] board, int x, int y, char ch){
        for(int i = 0; i < 9; i++){
            if(board[x][i] != '.' && board[x][i] == ch) return false;
            if(board[i][y] != '.' && board[i][y] == ch) return false;
            if(board[3 * (x / 3) + i / 3][ 3 * (y / 3) + i % 3] != '.' &&
                    board[3 * (x / 3) + i / 3][3 * (y / 3) + i % 3] == ch) return false;
        }
        return true;
    }
}