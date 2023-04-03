package offer53;

/**
 * 二分查找
 */
public class Solution {
    public int search(int[] nums, int target) {
        if (nums.length <= 0) {
            return 0;
        }
        int m = 0,n = nums.length - 1;
        int count = 0;
        while (m <= n) {
            int middle = (m + n) / 2;
            if (nums[middle] > target) {
                n = middle - 1;
                continue;
            }
            if (nums[middle] < target) {
                m = middle + 1;
                continue;
            }
            count++;
            for (int i = middle + 1; i < nums.length; i++) {
                if (nums[i] == target) {
                    count++;
                }
            }
            for (int i = middle - 1; i >= 0; i--) {
                if (nums[i] == target) {
                    count++;
                }
            }
            return count;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().search(new int[]{2, 2}, 3));
    }
}
