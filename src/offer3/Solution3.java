package offer3;

/**
 *  1. 最简单的方法肯定是直接两重循环 ps 注意优化，不然会超时
 *  2. 增加一个计数数组，时间复杂度降低，空间复杂度增加 ps:为啥时间内存比1还小
 *  3. 更np的，将数放到索引处，如果索引处的值等与该数则重复
 */
public class Solution3 {
    public int findRepeatNumber(int[] nums) {
       int i = 0;
       while (i < nums.length) {
           if (nums[i] == i) {
               i++;
               continue;
           }
           if (nums[nums[i]] == nums[i]) {
               return nums[i];
           }
           int tmp = nums[nums[i]];
           nums[nums[i]] = nums[i];
           nums[i] = tmp;
       }
       return -1;
    }
}
