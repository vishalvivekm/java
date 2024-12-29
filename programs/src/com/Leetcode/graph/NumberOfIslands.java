//DFS Soln

class Solution {
    private static void dfs(char[][] grid, int i, int j, boolean[][] visited) {
        visited[i][j] = true;
        int[][] directions = new int[][]{
            {-1, 0},
            {1, 0},
            {0,-1},
            {0,1},
            /*
            {-1,-1},  n-w
            {-1,1}, n-e
            {1,1}, s-e
            {1,-1} s-w
            
             */
          // walking robot: https://github.com/vishalvivekm/java/blob/main/programs/src/com/Leetcode/walkingRobot.java
        };
        for(int k = 0; k < directions.length; k++){
            int newi = i + directions[k][0];
            int newj = j + directions[k][1];
            if(isSafe(newi, grid.length, newj, grid[0].length) && grid[newi][newj] == '1' && !visited[newi][newj]){
                dfs(grid, newi, newj, visited);
            }
        }
    }
    public int numIslands(char[][] grid) {
        // a node = denoted by a  pair(r,c)

        int m = grid.length; // rows
        int n = grid[0].length; // columns

        boolean[][] visited = new boolean[m][n]; // all false by default
        int islands = 0;
        // top, down, left, right
        // {-1, 0}, {1, 0}, {0, -1}, {0, 1}

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1' && !visited[i][j]) {
                    islands++;
                    dfs(grid, i, j, visited);
                }
            }
        }
        return islands;
    }
    private static boolean isSafe(int r, int m, int c, int n){
        return (r >= 0 && r < m ) && (c >= 0 && c < n);
    }
}

// BFS Soln
