// LC 567

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int i = 0;
        int j = 0;
        int k = s1.length();

        HashMap<Character, Integer> mapS1 = new HashMap<>();
        for(char c: s1.toCharArray()){
            mapS1.put(c, mapS1.getOrDefault(c, 0) + 1);
           
        }
         HashMap<Character, Integer> mapS2 = new HashMap<>();
        System.out.println(mapS1);
        while(j < s2.length() ){

            mapS2.put(s2.charAt(j), mapS2.getOrDefault(s2.charAt(j), 0) + 1);
                 System.out.println(mapS2);
            if(j - i + 1 < k) {
                j++;
            }
            else if(j - i + 1 == k) {
                System.out.println(mapS2);
                if(mapS1.equals(mapS2)) return true;
                if(mapS2.get(s2.charAt(i)) == 1){
                    mapS2.remove(s2.charAt(i));
                } else if(mapS2.get(s2.charAt(i)) > 1) {
                    int val = mapS2.get(s2.charAt(i));
                    mapS2.put(s2.charAt(i), --val);
                }
                i++;
                j++;
            }
            
        }


        return false;
    }
}
