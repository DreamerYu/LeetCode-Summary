class Solution {
    int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, 1}, {0,-1}};
    int res = 0, allcount = 0;
    public int uniquePathsIII(int[][] grid) {
        int[] start = new int[2];
        int[] end = new int[2];

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    start[0] = i;
                    start[1] = j;
                    allcount++;
                }
                if(grid[i][j] == 2){
                    end[0] = i;
                    end[1] = j;
                    allcount++;
                }
                if(grid[i][j] == 0){
                    allcount++;
                }
            }
        }
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        visited[start[0]][start[1]] = true;
        help(grid, visited, start, end, 1);
        return res;

    }

    public void help(int[][] grid, boolean[][] visited, int[] start, int[] end, int count){
        if(start[0] == end[0] && start[1] == end[1] && count == allcount){
            res++;
            return;
        }

        for(int[] dir : dirs){
            int newx = start[0] + dir[0];
            int newy = start[1] + dir[1];
            if(newx < 0 || newx >= grid.length || newy < 0 || newy >= grid[0].length || visited[newx][newy] || grid[newx][newy] == -1) continue;

            visited[newx][newy] = true;
            help(grid, visited, new int[]{newx, newy}, end, count+1);
            visited[newx][newy] = false;
        }
    }
}