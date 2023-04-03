package offer19;

public class Solution {
    public boolean isMatch(String s, String p) {
        return isMatch(s.toCharArray(), p.toCharArray(), 0, 0);
    }

    public boolean isMatch(char[] s, char[] p, int pointS, int pointP) {
        if (pointS >= s.length && pointP >= p.length) {
            return true;
        }
        if ( pointP >= p.length) {
            return false;
        }
        if (charEqual(s, p, pointS, pointP)
                && isMatch(s, p, pointS + 1, pointP + 1)) {
            return true;
        }
        if (pointP + 1 < p.length && p[pointP + 1] == '*') {
            if (isMatch(s, p, pointS , pointP + 2)) {
                return true;
            }
            if (charEqual(s, p, pointS, pointP) && isMatch(s, p, pointS +1, pointP)) {
                return true;
            }
        }
        return false;
    }

    private boolean charEqual(char[] s, char[] p, int pointS, int pointP) {
        if (pointS >= s.length || pointP >= p.length) {
            return false;
        }
        return p[pointP] == '.' || p[pointP] == s[pointS];
    }


    public static void main(String[] args) {
        System.out.println(new Solution().isMatch("aaaaaaaaaaaaab", "a*a*a*a*a*a*a*a*a*a*c"));
    }
}
