package offer42;

public class Solution {
    public int maxSubArray(int[] nums) {
        int left = 0,right=1;
        int temp = nums[0];
        int max = temp;
        while (left < right && right < nums.length) {
            if (nums[right] >= 0) {
                temp+=nums[right];
                right++;
            }else if (nums[right] >= temp) {
                left = right;
                temp = nums[right];
                right++;
            } else {
                temp += nums[right];
                while (nums[left] <= 0 && left < right) {
                    temp -= nums[left];
                    left++;
                }
                right++;

            }
            max = Math.max(temp, max);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
