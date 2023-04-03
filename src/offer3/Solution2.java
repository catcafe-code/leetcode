package offer3;

/**
 *  1. 最简单的方法肯定是直接两重循环 ps 注意优化，不然会超时
 *  2. 增加一个计数数组，时间复杂度降低，空间复杂度增加 ps:为啥时间内存比1还小
 */
public class Solution2 {
    public int findRepeatNumber(int[] nums) {
        int[] numbers = new int[nums.length];
        for (int num : nums) {
            numbers[num]++;
            if (numbers[num] > 1) {
                return num;
            }
        }
        return -1;
    }
}
