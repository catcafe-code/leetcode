package offer21;

import java.util.Arrays;

public class Solution {
    public int[] exchange(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            if (nums[left] % 2 == 0 && nums[right] % 2 != 0) {
                swap(nums, left, right);
                left++;
                right--;
                continue;
            }
            if (nums[left] % 2 != 0) {
                left++;
            }
            if (nums[right] % 2 == 0) {
                right--;
            }
        }
        return nums;
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().exchange(new int[]{1,2,3,4})));
    }
}
