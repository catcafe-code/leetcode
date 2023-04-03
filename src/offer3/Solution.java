package offer3;

/**
 * 最简单的方法肯定是直接两重循环 ps 注意优化，不然会超时
 */
public class Solution {
    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = i+1; i1 < nums.length; i1++) {
                if (i == i1) {
                    continue;
                }
                if (nums[i] == nums[i1]) {
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
