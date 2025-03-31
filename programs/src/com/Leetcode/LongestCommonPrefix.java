import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String firstStr = strs[0];
        for(int i = 1; i < strs.length; i++){
            for(int j = 0; j < firstStr.length(); j++){
               if(j >= strs[i].length()){
                firstStr = firstStr.substring(0,j);
                break;
               }
               if(!(strs[i].charAt(j) == firstStr.charAt(j))){
                firstStr = firstStr.substring(0, j);
               }
            }
        }
        return firstStr.length() == 0 ? "" : firstStr;
    }
}
