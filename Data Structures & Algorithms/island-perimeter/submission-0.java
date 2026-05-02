class Solution {

    private int dfs(int i,int j,int[][]grid,boolean[][] vis){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0){
            return 1;
        }
        if(vis[i][j]){
        return 0;
        }
        vis[i][j]=true;
        return dfs(i+1,j,grid,vis) + dfs(i-1,j,grid,vis) + dfs(i,j+1,grid,vis) + dfs(i,j-1,grid,vis);
    }

    public int islandPerimeter(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int res=0;
        boolean[][] vis = new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    res+=dfs(i,j,grid,vis);
                }
            }
        }
        return res;
    }
}