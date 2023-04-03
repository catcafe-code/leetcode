import java.util.Arrays;

public class offer57_Solution {

    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int data = nums[left] + nums[right];
            if (data == target) {
                return new int[]{nums[left], nums[right]};
            }
            if (data > target) {
                right--;
            }
            if (data < target) {
                left++;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new offer57_Solution().twoSum(new int[]{2,7,11,15}, 9)));
    }
}
