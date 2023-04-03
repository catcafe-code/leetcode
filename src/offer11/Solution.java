package offer11;

public class Solution {
    public int minArray(int[] numbers) {
        if (numbers.length == 0) {
            return -1;
        }
        int pre = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (pre > numbers[i]) {
                return numbers[i];
            }
            pre = numbers[i];
        }
        return numbers[0];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().minArray(new int[]{1, 3, 5}));
    }
}
