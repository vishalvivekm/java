class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        
        long maxSum = 0;
        long currSum = 0;
        int i = 0;
        int j = 0;
        HashSet<Integer> set = new HashSet<Integer>();

        while(j < nums.length) {
            if(set.contains(nums[j])){
                set.clear();
                i++;
                j = i;
                currSum = 0;
                continue;
            }
            set.add(nums[j]);
            currSum += nums[j];
            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k){
                maxSum = Math.max(maxSum, currSum);
                set.remove(nums[i]);
                currSum = currSum - nums[i];
                i++;
                j++;
            }
        }
        return maxSum;
    }
}


