// LC 733
class Solution {

      private static void dfs(int[][] image, int i, int j, boolean[][] visited, int color, int starting_color) {
        visited[i][j] = true;
        image[i][j] = color;
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
        };
        for(int k = 0; k < directions.length; k++){
            int newi = i + directions[k][0];
            int newj = j + directions[k][1];
            if(isSafe(newi, image.length, newj, image[0].length) && image[newi][newj] == starting_color && !visited[newi][newj]){
                dfs(image, newi, newj, visited, color, starting_color);
            }
        }
      
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
         int m = image.length; // rows
        int n = image[0].length; // columns

        boolean[][] visited = new boolean[m][n]; // all false by default
        int starting_color = image[sr][sc];

        dfs(image, sr, sc, visited, color, starting_color);
        return image;
        
    }
     private static boolean isSafe(int r, int m, int c, int n){
        return (r >= 0 && r < m ) && (c >= 0 && c < n);
    }
}
