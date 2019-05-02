class Solution {
    long M=1000000l;
    public boolean isEscapePossible(int[][] blocked, int[] source, int[] target) {
        Set<Long> blockedSet=new HashSet<>();
        for(int[] p:blocked)
            blockedSet.add(p[0]*M+p[1]);
        return dfs(blockedSet, source,target, source, new HashSet<>());
    }
    int[][] dire=new int[][]{{1,0},{0,1},{0,-1},{-1,0}};
    public boolean dfs(Set<Long> blocked,int[] s, int[] t, int[] p, Set<Long> visited){
        if(p[0]>=s[0]+200 || p[0]<=s[0]-200 || p[1]>=s[1]+200 || p[1]<=s[1]-200 || p[0]==t[0] && p[1]==t[1]) return true;
        visited.add(p[0]*M+p[1]);
        boolean pass=false;
        for(int[] d:dire) {
            int x=p[0]+d[0], y=p[1]+d[1];
            if (!visited.contains(x*M + y) && !blocked.contains(x * M + y) && x>=0 && x<M && y>=0 && y<M)
                pass = pass || dfs(blocked, s,t, new int[]{x,y}, visited);
        }
        return pass;
    }
}