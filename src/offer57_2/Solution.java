package offer57_2;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] findContinuousSequence(int target) {
        if (target < 3) {
            return new int[0][0];
        }
        List<int[]> data = new ArrayList<>();
        for (int i = 2; i < target / 2; i++) {
            for (int j = (int) (Math.ceil(target / i) - 2); j <= target / i; j++) {
                if (j <= 0) {
                    continue;
                }
                if ( (2 * j + i - 1) * i != 2 * target) {
                    continue;
                }
                int[] row = new int[i];
                data.add(row);
                for (int k = 0; k < i; k++) {
                    row[k] = j + k;
                }
            }
        }
        int[][] res = new int[data.size()][];
        for (int i = 0; i < data.size(); i++) {
            res[i] = data.get(data.size() - 1 - i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] continuousSequence = new Solution().findContinuousSequence(10);
        System.out.println(continuousSequence);
    }
}
