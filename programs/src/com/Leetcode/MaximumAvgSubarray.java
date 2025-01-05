class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int currSum = 0;
        int maxSum = 0;

        for(int i = 0; i < k; i++){
            currSum += nums[i];
        }
        maxSum = currSum;

        for(int j = k; j < nums.length; j++){
            currSum += nums[j] - nums[j - k];
            maxSum = Math.max(currSum,maxSum);
        }
        double avg = (double)maxSum / (double)k;
        return avg;

    }
}
