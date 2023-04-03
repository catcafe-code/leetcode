package offer51;

public class Solution {
    public int reversePairs(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        int count = 0;
        int[] dp = new int[nums.length];
        dp[nums.length - 1] = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            int lastGtPoint = i + 1;
            if (nums[i] > nums[lastGtPoint]) {
                dp[i] += dp[lastGtPoint] + 1;
            }else if (nums[i] == nums[lastGtPoint]) {
                dp[i] += dp[lastGtPoint];
            }
            for (int j = i + 2; j < nums.length ; j++) {
                if (nums[i] > nums[j] && nums[lastGtPoint] >= nums[j]) {
                    dp[i] += (dp[j] + 1);
                    lastGtPoint = j;
                }
            }
            count += dp[i];
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reversePairs(new int[]{2,4,3,5,1}));
    }
}
