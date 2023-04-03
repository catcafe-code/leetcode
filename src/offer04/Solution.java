package offer04;

public class Solution {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        return findNumberIn2DArray(matrix, target, 0, matrix[0].length - 1, 0, matrix.length - 1);
    }

    public boolean findNumberIn2DArray(int[][] matrix, int target, int left, int right, int top, int bottom) {
        if (left > right || top > bottom || left < 0 || right > matrix[0].length || top < 0 || bottom > matrix.length){
            return false;
        }
        if (target < matrix[top][left]) {
            return false;
        }
        if (target > matrix[bottom][right]) {
            return false;
        }
        int middleX = (left + right) / 2;
        int middleY = (top + bottom) / 2;
        if (matrix[middleY][middleX] == target) {
            return true;
        }
        if (matrix[middleY][middleX] < target) {
            return findNumberIn2DArray(matrix, target, middleX + 1, right, top, bottom)
                    || findNumberIn2DArray(matrix, target, left, middleX, middleY + 1, bottom);
        }
        if (matrix[middleY][middleX] > target) {
            return findNumberIn2DArray(matrix, target, left, right, top, middleY - 1)
                    || findNumberIn2DArray(matrix, target, left, middleX - 1, middleY, bottom);
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] data ={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(new Solution().findNumberIn2DArray(data, 3));
    }

}
