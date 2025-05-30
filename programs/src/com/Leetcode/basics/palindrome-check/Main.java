class Solution {   
    public boolean palindromeCheck(String s) {
        //your code goes here
        // int start = 0;
        // // int end = s.length() - 1;
        
        // // while(start < end){
        // while(start <= s.length() / 2){
        //     // if(s.charAt(start) != s.charAt(end)){
        //     if(s.charAt(start) != s.charAt(s.length() - 1 - start)){
        //         return false;
        //     }
        //     start++;
        //     // end--;
        // }
        // return true;
        return palindromeCheckRecur(0, s.length() - 1, s);
    }
    public boolean palindromeCheckRecur(int start, int end, String s){
        if (start >= end) return true;
        if(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            return palindromeCheckRecur(start+1, end-1, s);
        }
        return false;
    }
}
