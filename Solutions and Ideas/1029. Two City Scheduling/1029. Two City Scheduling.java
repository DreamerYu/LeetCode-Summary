class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int res = 0;
        int n = costs.length;
        Arrays.sort(costs, (a,b) -> (b[1]-b[0]) - (a[1]-a[0]));
        for(int i = 0; i < n/2; i++) {
            res += costs[i][0] + costs[n-i-1][1];
        }
        return res;

    }
}