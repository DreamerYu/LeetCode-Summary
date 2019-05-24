class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix == null || matrix.length == 0) return res;
        int rowt = 0, rowd = matrix.length-1, coll = 0, colr = matrix[0].length-1;
        while(rowt <= rowd && coll <= colr){
            for(int i = coll; i <= colr; i++){
                res.add(matrix[rowt][i]);
            }
            rowt++;
            for(int i = rowt; i <= rowd; i++){
                res.add(matrix[i][colr]);
            }
            colr--;
            if(rowt <= rowd){
                for(int i = colr; i >= coll; i--){
                    res.add(matrix[rowd][i]);
                }
                rowd--;
            }
            if(coll<=colr){
                for(int i = rowd; i >= rowt; i--){
                    res.add(matrix[i][coll]);
                }
                coll++;
            }

        }
        return res;
    }
}