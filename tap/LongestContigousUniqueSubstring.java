package tap;

import java.util.HashSet;
import java.util.Set;

public class LongestContigousUniqueSubstring {
    public static int find(String str) {
        int i=0;
        int j=0;
        int max = 0;
        Set<Character> set = new HashSet();
        while (j<str.length()) {
            if (!set.contains(str.charAt(j))) {
                set.add(str.charAt(j));
                j++;
                max = Integer.max(set.size(),max);
            } else {
                set.remove(str.charAt(i));
                i++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(find(str));
    }
}
