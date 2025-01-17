class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int index = 0;
        for(int ele : nums1){
            map.put(ele, index++);
        }
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums1.length];
        Arrays.fill(result, -1);
        for(int j = nums2.length - 1; j >= 0; j--){

                if(!map.containsKey(nums2[j])) {
                    stack.push(nums2[j]);
                    continue;
                }
                if(stack.isEmpty()){
                    stack.push(nums2[j]);
                } else {
                    while(!stack.isEmpty() && stack.peek() <= nums2[j]){
                        stack.pop();
                    }
                    if(!stack.isEmpty()){
                        result[map.get(nums2[j])] = stack.peek();
                    }
                    stack.push(nums2[j]);
                }
        }
        return result;
        
    }
}
