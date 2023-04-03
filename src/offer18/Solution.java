package offer18;

import model.ListNode;

public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode temp = new ListNode(Integer.MIN_VALUE);
        temp.next = head;
        head = temp;
        while (temp != null) {
            if (temp.next != null && temp.next.val == val) {
                temp.next = temp.next.next;
                return head.next;
            }
            temp = temp.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(-3);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(-99);
        node1.next = node2;
        node2.next = node3;
        System.out.println(new Solution().deleteNode(node1, -3));
    }
}
