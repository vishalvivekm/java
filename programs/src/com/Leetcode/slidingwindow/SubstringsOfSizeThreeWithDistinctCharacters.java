package slidingwindow;

import java.util.HashSet;

public class SubstringsOfSizeThreeWithDistinctCharacters {
    public int countGoodSubstrings(String s) {
        int count = 0;

        int i = 0;
        int j = 0;
        HashSet<Character> set = new HashSet<>();

        while (j < s.length()) {

            while (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            if (j - i + 1 == 3) {
                count++;
                set.remove(s.charAt(i));
                i++;
            }
            j++;
        }
        return count;
    }
}