package leetCode_876;

import model.ListNode;

public class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode virtual = new ListNode(-1), slow = virtual, fast = virtual;
        virtual.next = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }
        }
        return slow;
    }
}
