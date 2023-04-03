package offer56_1;

public class Solution {

    public int[] singleNumbers(int[] nums) {
        int ret = 0;
        for (int num : nums) {
            ret ^= num;
        }
        int div = 1;
        while ((div & ret) == 1) {
            div <<= 1;
        }
        int a = 0,b = 0;
        for (int num : nums) {
            if ((num & div) != 0) {
                a ^= num;
            }else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }
}
