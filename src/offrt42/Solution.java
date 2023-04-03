package offrt42;

public class Solution {
    public int maxSubArray(int[] nums) {
       int[] maxNumbers = new int[nums.length];
       int andNumber = nums[0];
       maxNumbers[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
           if (andNumber < nums[i]) {
               maxNumbers[i] = nums[i];
               andNumber = nums[i];
           }else if (nums[i] < 0) {
               maxNumbers[i] = maxNumbers[i -1 ];
               andNumber += nums[i];
           }else if (andNumber + nums[i] >= maxNumbers[i -1 ]) {
               maxNumbers[i] = andNumber + nums[i];
               andNumber += nums[i];
           }

        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
