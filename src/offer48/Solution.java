package offer48;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 0) {
            return 0;
        }
        Set<Character> hash = new HashSet<>();
        int leftPoint = 0,rightPoint = 1;
        hash.add(s.charAt(leftPoint));
        int maxLength = 0;
        while (leftPoint < s.length() && rightPoint < s.length()) {
            if (hash.contains(s.charAt(rightPoint))) {
                maxLength = Math.max(maxLength, hash.size());
                hash.remove(s.charAt(leftPoint));
                leftPoint++;
                continue;
            }
            hash.add(s.charAt(rightPoint));
            rightPoint++;
        }
        return Math.max(maxLength, hash.size());
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("bbbbb"));
    }
}
