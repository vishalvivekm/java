// LC 518
class Solution {
    public int change(int amount, int[] coins) {
        int w = amount + 1;
        int n = coins.length + 1;

        int[][] dp = new int[n][w];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < w; j++){
                if(i == 0) dp[i][j] = 0;
                if(j == 0) dp[i][j] = 1;
            }
        }
        for(int i = 1; i < n; i++){
            for(int j = 1; j < w; j++){

                if (coins[i-1] <= j){
                    dp[i][j] = dp[i][j - coins[i-1]] + dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j];

                }
            }
        }
        return dp[n-1][w-1];
    }
}
