package offer56_2;

public class Solution {

    public int singleNumber(int[] nums) {
        int twos = 0, ones = 0;
        for (int num : nums) {
            ones = ones ^ num & ~twos;
            twos = twos ^ num & ~ones;
        }
        return ones;
    }
}
