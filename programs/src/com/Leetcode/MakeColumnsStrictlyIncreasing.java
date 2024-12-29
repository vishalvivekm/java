class Solution {
    public int minimumOperations(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int ops = 0;
        for(int i = 0; i < cols; i++ ){
             int prevVal = grid[0][i]; // instead I could have modified the grid itself, but to chose to do this
          // 
            for(int j = 1; j < rows; j++){
               
                if(grid[j][i] < prevVal || grid[j][i] == prevVal){
                    
                   // System.out.println(grid[j-1][i] + 1 - grid[j][i]);
                    ops += prevVal + 1 - grid[j][i];
                    prevVal = prevVal + 1;
                } else {
                    prevVal = grid[j][i];
                }
            }
        }
        return ops;
    }
}
