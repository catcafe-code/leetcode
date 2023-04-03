package offer15;

public class Solution {
    public int hammingWeight(int n) {
        int count = 0, circle = 0;
        while (n != 0) {
            circle++;
            if (circle > 32) {
                break;
            }
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().hammingWeight(-3));
    }
}
