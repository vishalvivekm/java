// Given an array arr of non-negative integers and an integer target, 
// the task is to count all subsets of the array whose sum is equal to the given target.


/*
Examples:

Input: arr[] = [5, 2, 3, 10, 6, 8], target = 10
Output: 3
Explanation: The subsets {5, 2, 3}, {2, 8}, and {10} sum up to the target 10.

Input: arr[] = [2, 5, 1, 4, 3], target = 10
Output: 3
Explanation: The subsets {2, 1, 4, 3}, {5, 1, 4}, and {2, 5, 3} sum up to the target 10.

Input: arr[] = [5, 7, 8], target = 3
Output: 0
Explanation: There are no subsets of the array that sum up to the target 3.

 */


/*
Constraints:
1 ≤ arr.size() ≤ 103
0 ≤ arr[i] ≤ 103
0 ≤ target ≤ 103
 */

// a variation of subset sum: subset sum asks to check if there is at least one subset for a given sum, here it's asked to return counts of all subset for a given sum, 
// simply change || with + in subset sum code
class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        // code here
        int n = nums.length;
        int w = target ;
        
        int[][] t = new int[n+1][w+1];
        // init
        for(int i = 0 ; i < n+1;i++){
            for(int j = 0; j < w+1; j++){
                if(i == 0) {
                    t[i][j] = 0;
                }
                if(j == 0){
                    t[i][j] = 1;
                }
                
            }
        }
        // fill the table
        for(int i = 1; i < n+1; i++){
            for(int j = 0; j < w+1; j++){
                if(nums[i-1] <= j){
                    t[i][j] = t[i-1][j-nums[i-1]] + t[i-1][j];
                } else if(nums[i-1] > j){
                    t[i][j]  = t[i-1][j];
                }
            }
        }
       // System.out.println(Arrays.deepToString(t));
        return t[n][w];
    }
}