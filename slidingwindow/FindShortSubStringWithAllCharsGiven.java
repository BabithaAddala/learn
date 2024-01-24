package slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class FindShortSubStringWithAllCharsGiven {
    public static void main(String[] args) {
        String str = "fa4chba4c";
        String targetStr = "abc";

        System.out.println(find(str, targetStr));

    }

    private static String find(String str, String targetStr) {
        char[] chars = str.toCharArray();
        char[] targetChars = targetStr.toCharArray();
        int k=targetChars.length;
        int start = 0;
        int minStringCount = 0;
        String res = "";

        List<String> list = new ArrayList<>();
        for (int i=0;i<chars.length;i++) {
            for (int j = 0; j < targetChars.length; j++) {
                if (targetChars[j] == chars[i]) {
                    k--;
                    start++;
                }

            }
            if ( k ==0 ){
                int n = i-start;
                StringBuilder sb = new StringBuilder();
                for (int y=0; y<=n;y++) {
                    sb.append(chars[i]);
                }
                minStringCount = Math.min(minStringCount, sb.length());
                list.add(sb.toString());
            }

            System.out.println("countttt" + minStringCount);
            System.out.println("LISTTT" + list);
        }

        for (String s: list) {
            if (minStringCount == s.length()) {
                 res = s;
            }
        }
        System.out.println("TESTTTTT" + res);
        return res;
    }
}
