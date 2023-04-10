package leetCode_167;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int value = numbers[left] + numbers[right];
            if (value == target) {
                return new int[] {left, right};
            }
            if (value < target) {
                left++;
            }else {
                right--;
            }
        }
        return new int[0];
    }
}
