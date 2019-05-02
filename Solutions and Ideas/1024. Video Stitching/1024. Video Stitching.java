class Solution {
    public int videoStitching(int[][] clips, int T) {

        int res = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] - b[0]));
        for(int i = 0; i < clips.length; i++){
            pq.add(clips[i]);
        }
        int end = 0, curmax = 0;
        while(!pq.isEmpty()){
            if(pq.peek()[0] > end){
                if(curmax == end && end < T) return -1;
                end = curmax;
                res++;
                if(end >= T) return res;
            }else{
                curmax = Math.max(curmax, pq.poll()[1]);
            }
        }
        if(curmax < T) return -1;
        if(curmax >= T && end < T) res++;
        return res;
    }
}