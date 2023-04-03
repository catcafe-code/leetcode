package offer25;

import model.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode newHead = new ListNode(-1);
        newHead.next =  l1.val > l2.val ? l1 : l2;
        ListNode node1 = l1.val > l2.val ? l2 : l1;
        ListNode temp = newHead;
        while ( node1 != null) {

            while (temp.next != null && temp.next.val <= node1.val) {
                temp = temp.next;
            }
            ListNode next = temp.next;
            temp.next = node1;
            temp = node1;
            node1 = next;
        }
        return newHead.next;
    }
}
