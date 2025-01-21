class Solution {
    public void moveZeroes(int[] nums) {
    //     int j = 0;
    //    for(int i = 0; i < nums.length; i++){
    //     if(nums[i] == 0){
    //         j = i;
    //         while(j < nums.length){
    //             if(nums[j] != 0){
    //                  nums[i] = nums[j];
    //                  nums[j] = 0;
    //                  break;
    //             }
    //             j++;
    //         }
    //     }
    //    }
    // two pointer approach
    int j = -1;
    for(int i = 0; i < nums.length; i++){
        if(nums[i] == 0) {
            j = i;
            break;
        }
    }
    if(j == -1){ // no zeros in the nums, return it as is
        return ;
    }

    for(int i = j + 1; i < nums.length; i++){
        if(nums[i] != 0){
            // swap jth and ith ele
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j++;
        }
    }
    }
}
