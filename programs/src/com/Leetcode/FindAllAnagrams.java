// LC 438

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int i = 0;
        int j = 0;
        int k = p.length();
        List<Integer> ans = new ArrayList<>();
        HashMap<Character, Integer> mapS1 = new HashMap<>();
        for(char c: p.toCharArray()){
            mapS1.put(c, mapS1.getOrDefault(c, 0) + 1);
           
        }
         HashMap<Character, Integer> mapS2 = new HashMap<>();
        while(j < s.length() ){
            mapS2.put(s.charAt(j), mapS2.getOrDefault(s.charAt(j), 0) + 1);
            if(j - i + 1 < k) {
                j++;
            }
            else if(j - i + 1 == k) {
                if(mapS1.equals(mapS2)) ans.add(i);
                if(mapS2.get(s.charAt(i)) == 1){
                    mapS2.remove(s.charAt(i));
                } else if(mapS2.get(s.charAt(i)) > 1) {
                    int val = mapS2.get(s.charAt(i));
                    mapS2.put(s.charAt(i), --val);
                }
                i++;
                j++;
            }
            
        }
        return ans;
    }
}
