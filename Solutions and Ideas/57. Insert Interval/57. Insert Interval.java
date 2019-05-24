class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < intervals.length; i++){
            list.add(new int[]{intervals[i][0], intervals[i][1]});
        }
        int newstart = newInterval[0];
        int newend = newInterval[1];
        int index = list.size();
        for(int i = 0; i < list.size(); i++){
            if(newInterval[0] <= list.get(i)[1]){
                index = i;
                break;
            }
        }
        while(index < list.size() && list.get(index)[0] <= newInterval[1]){
            newstart = Math.min(newstart, list.get(index)[0]);
            newend = Math.max(newend, list.get(index)[1]);
            list.remove(index);
        }
        list.add(index, new int[]{newstart, newend});

        int[][] res = new int[list.size()][2];
        int i = 0;
        for(int[] ele : list){
            res[i++] = ele;
        }
        return res;
    }
}