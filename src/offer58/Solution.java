package offer58;

public class Solution {
    public String reverseLeftWords(String s, int n) {
        if (s == null) {
            return null;
        }
        char[] chars = s.toCharArray();
        char[] newString = new char[s.length()];
        for (int i = n; i < chars.length ; i++) {
            newString[i-n] = chars[i];
        }
        for (int i = 0; i < n; i++) {
            newString[chars.length - n + i] = chars[i];
        }
        return new String(newString);
    }

    public static void main(String[] args) {

        System.out.println(new Solution().reverseLeftWords("lrloseumgh", 6));
    }

}
