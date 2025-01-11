// LC 916
class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ansList = new ArrayList<>();

        HashMap<Character, Integer> count2 = new HashMap<>();

        for(String str: words2){
             HashMap<Character, Integer> count3 = new HashMap<>();
            for(Character ch : str.toCharArray()){
                count3.put(ch, count3.getOrDefault(ch, 0) + 1);
            }
            
            count3.forEach((k, v) -> count2.put(k, Math.max(v, count2.getOrDefault(k, 0))));

        }

        System.out.println("count2: " + count2);
        for(String str1: words1){
            HashMap<Character, Integer> count1 = new HashMap<>();
            for(Character ch1: str1.toCharArray()){
                count1.put(ch1, count1.getOrDefault(ch1, 0) + 1);
            }
            System.out.println("count1 " + " : " + count1);
            boolean isAns = true;
            for (Map.Entry<Character,Integer> mapElement : count2.entrySet()) {
                char key = mapElement.getKey();
                int value = (mapElement.getValue());
                
                System.out.println(key + ": " + value);
                if(!count1.containsKey(key)){
                    isAns = false;
                    break;
                }
                if(count1.get(key) < value){
                    isAns = false;
                    break;
                }
            }
            if(isAns){
                System.out.println(str1 + "is the ans string ");
                ansList.add(str1);
            }
        }
        return ansList;
    }
}
