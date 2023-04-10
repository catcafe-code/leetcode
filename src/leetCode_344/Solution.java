package leetCode_344;

public class Solution {
    public void reverseString(char[] s) {
        if (s.length <= 1) {
            return;
        }
        int left = 0,  right = s.length - 1;
        while (left < right) {
            char tmp = s[right];
            s[right] = s[left];
            s[left] = tmp;
            left++;
            right--;
        }
    }
}
