
//  top-down (recursive) memoization approach.
class Solution {
    // Function to return max value that can be put in knapsack of capacity.

 
    static int knapsack(int capacity, int val[], int wt[]) {
        int[][] dp= new int[val.length+1][capacity+1];
        
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                dp[i][j] = -1;
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

/*
Given n items, each with a specific weight and value, and a knapsack with a capacity of W, the task is to put the items in the knapsack such that the sum of weights of the items <= W and the sum of values associated with them is maximized. 

Note: You can either place an item entirely in the bag or leave it out entirely. Also, each item is available in single quantity.


Input: W = 4, val[] = [1, 2, 3], wt[] = [4, 5, 1] 
Output: 3
Explanation: Choose the last item, which weighs 1 unit and has a value of 3.
Constraints:
2 ≤ val.size() = wt.size() ≤ 103
1 ≤ W ≤ 103
1 ≤ val[i] ≤ 103
1 ≤ wt[i] ≤ 103
*/
// bottom up: tabulation
class Solution {

    static int knapsack(int capacity, int val[], int wt[]) {
        
        int n = wt.length; // or val.length; // val and wt arrays are of same length, having one entry per item
                           // val[] = [1,2,3], wt[] = [4,5,1]

        int w = capacity;
        int[][] t = new int[n+1][w+1];
        /**
         * 0 1 2 3 4 5 6 -> capacity
         * 1
         * 2
         * 3
         * |
         * size of items array
         * 
         */
        
        // initialisation
        for(int i= 0; i < n+1; i++ ){
            for(int j= 0; j < w+1; j++){
                if(i == 0 || j = 0) { 
                    // first row, i = 0 (size of items array = 0) as no items are available in the bag, profit  = 0
                    // first col, j = 0 ( capacity of knapsack = 0), as capacity is 0, we can't have any profit no matter the number of available items.
                    t[i][j] = 0;
                }
            }
        }
        // code here
        // fill the table
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < w+1; j++){
                
                if(wt[i-1] <= j){
                    t[i][j] = Math.max(val[i-1] + t[i-1][j-wt[i-1]], t[i-1][j]);
                } else {
                    t[i][j] = t[i-1][j];
                }

            }
        }

        return t[n][w];
     
    }
}