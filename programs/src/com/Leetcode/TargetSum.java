// LC 494

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
     return returnTargetSum(0, nums,0, target);
    }
    private static int returnTargetSum(int ele, int[] nums, int index, int target){
        if(nums.length == index){
            if(ele == target) return 1;
            return 0;
        }
        // int ch = nums[0];
        int left = returnTargetSum(ele + nums[index], nums, index + 1, target);
        int right = returnTargetSum(ele - nums[index], nums, index + 1, target);

    return left + right;

    }
}
