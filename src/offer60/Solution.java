package offer60;

import java.util.Arrays;

public class Solution {


    public double[] dicesProbability(int n) {
        int[][] f = new int[n + 1][];
        f[1] = new int[7];
        for (int i = 1; i <= 6; i++) {
           f[1][i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            f[i] = new int[6 * i + 1];
            for (int j = i; j <= 6 * i; j++) {
                f[i][j] = 0;
                for (int k = 1; k <= 6;k++) {
                    if ( j-k < i - 1 || j-k > 6*(i-1)) {
                        continue;
                    }
                    f[i][j] += f[i - 1][j - k];
                }
                if (f[i][j] == 0) {
                    f[i][j] = 1;
                }
            }
        }
        double[] result = new double[5 * n + 1];
        double number = 1.0 / Math.pow(6, n);
        for (int i = n; i < f[n].length; i++) {
            result[i - n] = number * f[n][i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().dicesProbability(2)));
    }
}
