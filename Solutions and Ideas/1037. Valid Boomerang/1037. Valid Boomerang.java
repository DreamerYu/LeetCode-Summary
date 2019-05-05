class Solution {
//     public boolean isBoomerang(int[][] points) {
//         int k = 0;
//         if((points[0][0] == points[1][0]&&points[0][1] == points[1][1]) || (points[1][0] == points[2][0]&&points[1][1] == points[2][1]) || (points[0][0] == points[2][0]&& points[0][1] == points[2][1])) return false;
//         if(points[0][1] - points[1][1] != 0){
//             if(points[1][1] - points[2][1] == 0) return true;
//             if(Math.abs(compute(points[0], points[1]) - compute(points[1], points[2])) < 0.0001) return false;
//             return true;
//         }else if(points[1][1] - points[2][1] != 0){
//             return true;
//         }else return false;

//     }

//     public double compute(int[] a, int[] b){
//         return (double)(a[0]-b[0])/(double)(a[1]-b[1]);
//     }

    public boolean isBoomerang(int[][] p) {
        return (p[0][0] - p[1][0]) * (p[0][1] - p[2][1]) != (p[0][0] - p[2][0]) * (p[0][1] - p[1][1]);
    }
}