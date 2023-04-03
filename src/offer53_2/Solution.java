package offer53_2;

/**
 * 坑爹的题目，二分查找找不到的时候有特殊返回
 */
public class Solution {
    public int missingNumber(int[] nums) {
        if (nums.length == 0) {
            return 1;
        }
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (middle == nums[middle]) {
                left = middle + 1;
                continue;
            }
            right = middle - 1;
            if (right < 0 || right == nums[right]) {
                return middle;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().missingNumber(new int[]{0}));
    }
}
