package slidingwindow;


// method 1

class MaxSubArrSizeK1 {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int sum = 0;
        int max = Integer.MIN_VALUE, i = 0, j = 0;
        
        while(j < arr.length){
            sum += arr[j];
            
            if(j - i + 1 == k){
                max = Math.max(max, sum);
                sum -= arr[i];
                i++;
               // j++;
            }// else {
               // j++;
            //}
            j++;
        }
        return max;
    }
}

// method 2 


// User function Template for Java

class MaxSubArrSizeK2 {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int maxsum = 0;
        int currsum = 0;
        
        for(int start = 0; start < k; start++){
            currsum += arr[start];
            
        
        }
        maxsum = Math.max(maxsum,currsum);
        for(int i = k; i < arr.length; i++){
            currsum += arr[i] - arr[i-k];
            maxsum = Math.max(maxsum, currsum);
        }
        return maxsum;
    }
}

// Runner
public class MaxSubArrSizeK {
    public static void main(String[] args) {
        // Test the methods here
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        MaxSubArrSizeK1 method1 = new MaxSubArrSizeK1();
        MaxSubArrSizeK2 method2 = new MaxSubArrSizeK2();
        System.out.println("Method 1: " + method1.maximumSumSubarray(arr, k)); //
        System.out.println("Method 2: " + method2.maximumSumSubarray(arr, k)); // 

    }
}