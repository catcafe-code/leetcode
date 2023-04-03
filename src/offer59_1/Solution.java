package offer59_1;

import java.util.*;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       if (nums.length == 0 || k <= 0) {
           return new int[0];
       }
       Deque<Integer> deque = new LinkedList<>();
       int[] ans = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
           if (!deque.isEmpty()) {
               if (i - k >= 0 && deque.peekFirst() == nums[i-k]) {
                   deque.pollFirst();
               }
               while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                   deque.pollLast();
               }
           }
           deque.offerLast(nums[i]);
           if (i - k + 1 >= 0) {
               ans[i - k + 1] = deque.peekFirst();
           }
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3)));
    }

}
