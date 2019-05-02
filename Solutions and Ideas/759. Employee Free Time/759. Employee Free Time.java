class Solution {
    public int[][] employeeFreeTime(int[][][] schedule) {

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(a[0]-b[0]));

        for(int i = 0; i < schedule.length; i++){
            for(int j = 0; j < schedule[i].length; j++){
                pq.add(schedule[i][j]);
            }
        }
        List<int[]> res = new ArrayList<>();
        int start = Integer.MIN_VALUE;

        while(!pq.isEmpty()){
            int[] e = pq.poll();
            if(start < e[0]){
                res.add(new int[]{start, e[0]});
                start = e[1];
            }else{
                start = Math.max(start, e[1]);
            }
        }
        int[][] re = new int[res.size() - 1][2];
        for(int i = 1; i < res.size(); i++){
            re[i - 1] = res.get(i);
        }
        return re;
    }
}