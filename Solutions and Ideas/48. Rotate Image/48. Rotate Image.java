class Solution {
    public void rotate(int[][] matrix) {

        // first reverse from left to right
        for(int i = 0; i < matrix.length; i++){
            int start = 0, end = matrix[i].length-1;
            while(start < end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }

        // then transpose
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j <= matrix.length - 1 - i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - 1 - j][matrix.length - 1 - i];
                matrix[matrix.length - 1 - j][matrix.length - 1 - i] = temp;
            }
        }
    }
}