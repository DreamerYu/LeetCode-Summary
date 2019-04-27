class Solution {
    // quickselect
    public int[][] kClosest(int[][] points, int K){
        quickselect(points, 0, points.length - 1, K);
        int[][] res = new int[K][2];
        for(int i = 0; i < K; i++){
            res[i] = points[i];
        }
        return res;
    }

    public void quickselect(int[][] points, int start, int end, int k){
        int low = start, high = end;
        int[] pivot = points[high];
        while(low < high){
            if(distance(points[low++])>=distance(pivot)) swap(points, --low, --high);
        }
        swap(points, low, end);
        int position = low - start + 1;
        if(position == k){
            return;
        }else if(position > k){
            quickselect(points, start, low - 1, k);
        }else{
            quickselect(points, low + 1, end, k - position);
        }
    }

    public void swap(int[][] points, int x, int y){
        int[] temp = points[x];
        points[x] = points[y];
        points[y] = temp;
    }

    public int distance(int[] n){
        return n[0]*n[0]+n[1]*n[1];
    }

    // proirityqueue
    public int[][] kClosest2(int[][] points, int K) {
        int[][] res = new int[K][2];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(a[0]*a[0]+a[1]*a[1]-b[0]*b[0]-b[1]*b[1]));

        for(int[] e : points){
            pq.add(e);
        }
        int index = 0;
        while(K>0){
            int[] pp = pq.poll();
            // res[index][0] = pp[0];
            // res[index++][1] = pp[1];
            res[index++] = pp;
            K--;
        }
        return res;
    }
}