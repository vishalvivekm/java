class Solution {

    public void dfs(int[][] grid, int rows, int cols, int i, int j){
       grid[i][j] = 1;
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
       
        for(int t = 0; t < 4; t++){
            int newI = i + dirs[t][0];
            int newJ = j + dirs[t][1];

            if(isSafe(newI, newJ, rows, cols) && grid[newI][newJ] == 0){
                
                    dfs(grid,rows, cols, newI, newJ);
                
                
            }
        }
    }
    public boolean isSafe(int newI, int newJ, int rows, int cols){
        return newI >= 0 && newI < rows && newJ >= 0 && newJ < cols;
    }
    public int closedIsland(int[][] grid) {
      
        int rows = grid.length;
        int cols = grid[0].length;

        // column first, column last
        for(int i = 0; i < rows; i++){
            if(grid[i][0] == 0) dfs(grid, rows, cols, i, 0);
            if(grid[i][cols-1] == 0) dfs(grid, rows, cols, i, cols-1);
        }

        // first rows, last row
        for(int j = 0; j < cols; j++){
            if(grid[0][j] == 0) dfs(grid, rows, cols, 0, j);
            if(grid[rows-1][j] == 0) dfs(grid, rows, cols, rows -1, j);
        }
       int count = 0;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                    if(grid[i][j] == 0){
                        dfs(grid, rows, cols, i, j);
                        count++;
                    }
            }
        }
        return count;
    }
}
