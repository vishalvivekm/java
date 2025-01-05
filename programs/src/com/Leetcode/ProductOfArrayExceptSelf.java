// LC 238
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ansArr = new int[n];

        // my N-squred solution; meh

        // for(int i = 0; i < ansArr.length; i++){
        //     int ans = 1;
        //     for(int j = 0; j < ansArr.length; j++){
        //         if(j == i) continue;
        //         ans = ans * nums[j];
        //     }
        //     ansArr[i] = ans;
        // }

        // found it
        // [1,2,3,4]
        //
        // calc prefix_mult = [1,2,6,24]
        // calc suffix_mult = [24,24,12,4]
        // if i = 0; ans[i] = suffix_mult[i + 1];
        // if i = nums.length - 1; ans[i] = prefix_mult[i-1];
        // else
        // ans[i] = prefix_mult[i-1] * suffix_mult[i+1];

      // O(N)
        int[] prefix_mult = new int[n];
        int[] suffix_mult = new int[n];
        prefix_mult[0] = nums[0];
        suffix_mult[n-1] = nums[n-1];

        for(int i = 1, j = n - 2; i <= n-1 && j >= 0; i++, j--){
            prefix_mult[i] = prefix_mult[i-1] * nums[i];
            suffix_mult[j] = suffix_mult[j + 1] * nums[j];
        }
        System.out.println(Arrays.toString(prefix_mult));
        System.out.println(Arrays.toString(suffix_mult));

        for(int k = 0; k < n; k++){
            if(k == 0) {
                ansArr[k] = suffix_mult[k+1];
            } else if( k == n - 1) {
                ansArr[k] = prefix_mult[k-1];
            } else {
                ansArr[k] = prefix_mult[k-1] * suffix_mult[k+1];
            }
        }

        return ansArr;
    }
}
