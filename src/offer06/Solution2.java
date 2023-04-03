package offer06;

import java.util.ArrayList;
import java.util.List;

/**
 *题目并没有要求倒转链表， 难度down down leetcode里面递推居然比递归节省空间 0.0
 */
public class Solution2 {
    public int[] reversePrint(ListNode head) {
        List<Integer> data = new ArrayList<>();
        while (head != null) {
            data.add(head.val);
            head = head.next;
        }
        int[] result = new int[data.size()];
        for (int i = data.size() - 1; i >= 0; i--) {
            result[data.size() - i -1] = data.get(i);
        }
        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

    }
}





