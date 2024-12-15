// LC 967
class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i < 10; i++){
            r(i, k, n, list);
        }
        int[] ans = new int[list.size()];
        int i = 0;
        for(int ele: list) {
            ans[i++] = ele;
        }
        //return list.stream().mapToInt(i -> i).toArray(); 
        return ans;
        // lol not using stream results in 100% faster runtime
        // concept to check
    }
    
      private static void r(int up, int k, int n, ArrayList<Integer> list) {
        
        if(String.valueOf(up).length() == n) {
          list.add(up);
         return;   
        }
        int diff = up % 10 - k;
        int sum = up % 10 + k;
        
        if(diff >= 0) r((up * 10) + diff, k,n, list);
        if( k != 0 && sum <= 9) r((up * 10) + sum, k, n, list);
            
        // edge case: when k = 0, both if end up giving same integers i.e 111, 111, 222, 222 and so on. 
        // that is why skip the second if k = 0
          // below I'm checking this when appending the number to list, but it can be done like ^^ too.
    }
    
    
//     private static void r(int up, int k, int n, ArrayList<Integer> list) {
        
//         if(String.valueOf(up).length() == n) {
//         if(list.size() == 0 || list.get(list.size() - 1) != up) list.add(up);
//          return;   
//         }
//         int diff = up % 10 - k; 
//         int sum = up % 10 + k;
        
//         if(diff >= 0) r((up * 10) + diff, k,n, list);
//         if(sum <= 9) r((up * 10) + sum, k, n, list);
            
        
//     }

  // getting last digit = num %10;
  // append digit to an integer: integer * 10 + digit
  // 78 * 10 + 9 = 789
}
