package offer29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int[] res = new int[matrix.length * matrix[0].length];
        int point = 0;
        int left = 0, top = 0, right = matrix[0].length, bottom = matrix.length;
        while (left < right && top < bottom) {
            for (int i = left; i < right && top < bottom; i++) {
                res[point++] = matrix[top][i];
            }
            top++;
            for (int i = top; i < bottom && left < right; i++) {
                res[point++] = matrix[i][right - 1];
            }
            right--;
            for (int i = right - 1; i >=  left && top < bottom; i--) {
                res[point++] = matrix[bottom - 1][i];
            }
            bottom--;
            for (int i = bottom - 1; i >= top && left < right; i--) {
                res[point++] = matrix[i][left];
            }
            left++;
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}})));
    }
}
