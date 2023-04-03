package offer66;

import java.util.Arrays;

public class Solution {
    public int[] constructArr(int[] a) {
        if (a.length == 0) {
            return new int[0];
        }
        if (a.length == 1) {
            return new int[]{0};
        }
        int[] data1 = new int[a.length];
        data1[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            data1[i] = data1[i-1] * a[i];
        }
        int[] data2 = new int[a.length];
        data2[data2.length - 1] = a[a.length - 1];
        for (int i = data2.length - 2; i >= 0 ; i--) {
            data2[i] = data2[i+1] * a[i];
        }
        int[] res = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (i - 1 < 0 ){
                res[i] = data2[i+1];
                continue;
            }
            if (i + 1 >= a.length) {
                res[i] = data1[i-1];
                continue;
            }
            res[i] = data1[i-1] * data2[i+1];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().constructArr(new int[]{1})));
    }
}
