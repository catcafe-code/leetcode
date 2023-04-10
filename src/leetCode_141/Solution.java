package leetCode_141;

import model.ListNode;

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode p1 = newHead, p2 = newHead.next;
        while (p1 != p2) {
            if (p1 != null) {
                p1 = p1.next;
            }
            if (p2 != null) {
                p2 = p2.next == null ? null : p2.next.next;
            }
        }
        return p1 != null;
    }
}
