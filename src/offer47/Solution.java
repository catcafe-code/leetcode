package offer47;

public class Solution {
    public int maxValue(int[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int[][] price = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i == 0 && j == 0) {
                    price[i][j] = grid[i][j];
                    continue;
                }
                price[i][j] = Math.max(price[Math.max(i-1, 0)][j], price[i][Math.max(j-1, 0)]) + grid[i][j];
            }
        }
        return price[grid.length - 1][grid[0].length - 1];
    }
}
