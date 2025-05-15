import java.util.*;


class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> chars = new HashSet<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char current = s.charAt(end);
            
            while (chars.contains(current)) {
                chars.remove(s.charAt(start));
                start++;
            }
            
            chars.add(current);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}

public class main {
    public static void main(String[] args) {
        Solution S = new Solution();
        System.out.println(S.lengthOfLongestSubstring("nfpdmpi"));

    }
}