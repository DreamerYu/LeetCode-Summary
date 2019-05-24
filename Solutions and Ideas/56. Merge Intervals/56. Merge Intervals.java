class Solution {
    public int[][] merge(int[][] intervals) {
        // sort start&end
        int n = intervals.length;
        int[] starts = new int[n];
        int[] ends = new int[n];
        for (int i = 0; i < n; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        // loop through
        List<int[]> res = new ArrayList<int[]>();
        for (int i = 0, j = 0; i < n; i++) { // j is start of interval.
            if (i == n - 1 || starts[i + 1] > ends[i]) {
                res.add(new int[]{starts[j], ends[i]});
                j = i + 1;
            }
        }

        int[][] result = new int[res.size()][2];
        int index = 0;
        for(int[] ele : res){
            result[index++] = ele;
        }
        return result;
    }
}