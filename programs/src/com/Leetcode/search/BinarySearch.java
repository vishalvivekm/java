class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == k){
                if(mid -1 >= 0 && arr[mid-1] ==k){
                    end = mid - 1;
                    continue;
                }
                return mid;
            }
            if(arr[mid] > k) end = mid - 1;
            if(arr[mid] < k) start = mid + 1;
        }
        
        return -1;
    }
}

// Recursive


class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        
        int start = 0;
        int end = arr.length - 1;
        
        return bsRecurs(arr, k, start, end);
    }
    private static int bsRecurs(int[] arr, int k, int start, int end){
        
        if(start > end) return -1;
        int mid = (start + end) / 2;
        if(arr[mid] == k){
            if(mid - 1 >= 0 && arr[mid - 1] == k){
                end = mid - 1;
            //   return bsRecurs(arr, k, start, end);
            } else {
                 return mid;
            }
           
        } else if(arr[mid] > k){
            end = mid -1;
        } else {
            start = mid + 1;
        }
         return bsRecurs(arr, k, start, end);
    }
}


//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline
        while (t-- > 0) {
            int k = sc.nextInt();
            sc.nextLine(); // consume the newline
            String input = sc.nextLine();
            String[] strNumbers = input.split(" ");
            int[] arr = new int[strNumbers.length];
            for (int i = 0; i < strNumbers.length; i++) {
                arr[i] = Integer.parseInt(strNumbers[i]);
            }
            Solution ob = new Solution();
            int res = ob.binarysearch(arr, k);
            System.out.println(res);

            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java
