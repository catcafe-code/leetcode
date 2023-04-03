package offer58;

/**
 * 字符串三次反转
 * ps：理论空间比第一次少，实际时间空间比第一次还多。。。
 */
public class Solution2 {
    public String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        reverse(0, n - 1, chars);
        reverse(n, s.length() -1, chars);
        reverse(0, s.length() - 1, chars);
        return new String(chars);
    }

    private void reverse(int start, int end, char[] chars) {
        if (start >= end) {
            return;
        }
        for (int i = start; i <= start + (end - start) / 2; i++) {
            char tmp =  chars[end - i + start];
            chars[end - i + start] = chars[i];
            chars[i] = tmp;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution2().reverseLeftWords("abcdefg", 2));
    }
}
