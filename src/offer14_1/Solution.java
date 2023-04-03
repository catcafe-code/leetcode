package offer14_1;

public class Solution {

    int mod = 1000000007;
    /**
     * todo
     * @param n
     * @return
     */
    public int cuttingRope(int n) {
        int[][] dp = new int[n][n + 1];
        for (int i = 1; i < n; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i < n; i++) {
            for (int j = i  + 1; j <= n; j++) {
                dp[i][j] = 0;
                for (int k = i; k < j; k++) {
                    int tmp = dp[i-1][k] * (j-k);
                    if (tmp > dp[i][j]) {
                        dp[i][j] = tmp;
                    }
                }
            }
        }
        int max = 0;
        for (int i = 1; i < n; i++) {
            if (dp[i][n] > max) {
                max = dp[i][n];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().cuttingRope(10));
    }
}
