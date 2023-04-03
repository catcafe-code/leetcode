package offer06;

import java.util.ArrayList;
import java.util.List;

/**
 *题目并没有要求倒转链表， 难度down down
 */
public class Solution {
    public int[] reversePrint(ListNode head) {
        List<Integer> data = new ArrayList<>();
        push(data, head);
        int[] result = new int[data.size()];
        for (int i = data.size() - 1; i >= 0; i--) {
            result[i] = data.get(i);
        }
        return result;
    }

    private void push(List<Integer> data, ListNode head) {
        if (head == null) {
            return;
        }
        this.push(data, head.next);
        data.add(head.val);
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

    }
}





