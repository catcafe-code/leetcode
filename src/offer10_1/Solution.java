package offer10_1;

/**
 * 只能递推
 * 递归需要存储计算值
 */
public class Solution {
    public int fib(int n) {
        int mod = 1000000007;
        if (n < 2) {
            return n;
        }
        int q = 0, p =1, tmp;
        for (int i = 2; i <= n; i++) {
            tmp = p;
            p = (q + p) % mod;
            q = tmp;
        }
        return p;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().fib(3));
    }
}
