class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int ele: nums){

        //     map.put(ele, map.getOrDefault(ele, 0) + 1);
        //     if(map.get(ele) > nums.length / 2) return ele;
        // }
        // return -1;

        // frequency array; not practical here
        // given the constrainsts
        // 
        // n == nums.length
        // 1 <= n <= 5 * 104
        // -109 <= nums[i] <= 109


        // find the max ele in nums to determine array size
        // int max = 0;
        // for (int num : nums) {
        //     max = Math.max(max, num);
        // }

        // // Initialize the frequency array
        // int[] count = new int[max + 1];

        // // Count frequencies of elements
        // for (int num : nums) {
        //     count[num]++;
        //     // If the frequency exceeds n / 2, return the element
        //     if (count[num] > nums.length / 2) {
        //         return num;
        //     }
        // }

        // // Majority element is guaranteed, so we don't need a fallback return
        // return -1;
    
    // Moore's voting algo

    int count = 0, candidate = 0;

    for(int ele: nums){
        if (count == 0){
            candidate = ele;
        }
        count += (ele == candidate) ? 1 : -1;
    }
    
    // check to make sure the candidate is indeed the majority element i.e
    // appearing > floor of N / 2
    // not necessary for this question, as it's guranteed
    // so candidate at this point be the answer
    int count1 = 0;
    for(int el: nums){
        if(el == candidate) count1++;
       // if(count1 > nums.length / 2) return candidate;
    }
    if(count1 > (nums.length / 2)) return candidate;

    return -1;
}
}
