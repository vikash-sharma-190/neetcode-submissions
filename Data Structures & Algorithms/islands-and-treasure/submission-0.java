class Solution {
     private int[][] dir = {{1, 0}, {-1, 0},
                                  {0, 1}, {0, -1}};
    private int INF = 2147483647;
    private int r, c;

    private int bfs(int i,int j,int[][]grid){
        Queue<int[]> que = new LinkedList<>();
        boolean[][] vis = new boolean[r][c];

        que.offer(new int[]{i,j});
        vis[i][j]=true;
        int s = 0;

        while(!que.isEmpty()){
            int size = que.size();
            while(size-->0){
                int[] cur = que.poll();
                int r_ = cur[0];
                int c_ = cur[1];

                if(grid[r_][c_]==0) return s;

                for(int[] d : dir){
                    int nr = r_ + d[0];
                    int nc = c_ + d[1];

                    if(nr>=0 && nr<r && nc>=0 && nc<c && grid[nr][nc]!=-1 && !vis[nr][nc]){
                        vis[nr][nc] =true;
                        que.offer(new int[]{nr,nc});
                    }
                }
            }
            s++;
        }
        return INF;
    }
    public void islandsAndTreasure(int[][] grid) {
        r = grid.length;
        c = grid[0].length;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               if(grid[i][j]==INF){
                    grid[i][j] = bfs(i,j,grid);
                }
            }
        }
    }
}
