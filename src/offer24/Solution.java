package offer24;

import java.util.List;

/**
 * 刚说没有反转链表，里面来了
 *
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prv = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prv;
            prv = head;
            head = next;
        }
        return prv;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

    }

}
