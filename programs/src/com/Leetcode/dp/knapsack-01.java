
//  top-down (recursive) memoization approach.
class Solution {
    // Function to return max value that can be put in knapsack of capacity.

 
    static int knapSack(int capacity, int val[], int wt[]) {
        int[][] dp= new int[1002][1002];
        
        for(int j= 0; j < 1002; j++ ){
        
            for(int i = 0; i < 1002; i++){
            dp[j][i] = -1;
            }
            
             }
        // code here
        return kpSack(capacity, val, wt, val.length, dp);
     
    }
    static int kpSack(int capacity, int[] val, int[] wt, int n, int[][] dp){
        
       if(n == 0 || capacity == 0) return 0;
       
       if(dp[n][capacity] != -1) return dp[n][capacity];
        
        if(wt[n-1] <= capacity){
            dp[n][capacity] = Math.max(val[n-1] + kpSack(capacity - wt[n-1], val, wt, n - 1, dp), kpSack(capacity, val, wt, n - 1, dp));
        } else if(wt[n-1] > capacity){
            dp[n][capacity] =  kpSack(capacity, val, wt, n - 1, dp);
        }
            return dp[n][capacity];
        
    }
}
