package leetCode_92;

import model.ListNode;

public class Solution {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (right == 0) {
            return head;
        }
        ListNode newHead =reverseBetween(head, left - 1, right - 1);
        if (left > 0 && right > 0) {
            head.next.next = head                                                                                                                                                        ;
            head.next = null;
        }
        return newHead;
    }
}
