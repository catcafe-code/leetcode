package offer10_2;

public class Solution {
    static final int MOD = 1000000007;
    public int numWays(int n) {
        if (n <= 1) {
            return 1;
        }
        int[][] p = {{1, 1}, {1, 0}};
        int[][] res = fpow(p, n);
        return res[0][0];
    }

    private int[][] fpow(int[][] p, int n) {
        int[][] ret = {{1, 0}, {0, 1}};
        while (n > 0) {
            if ((n & 1) == 1) {
                ret = multiply(ret, p);
            }
            n >>= 1;
            p = multiply(p, p);
        }
        return ret;
    }

    public int[][] multiply(int[][] a, int[][] b) {
        int[][] c = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = (int) (((long) a[i][0] * b[0][j] + (long) a[i][1] * b[1][j]) % MOD);
            }
        }
        return c;
    }
}
