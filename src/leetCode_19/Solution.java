package leetCode_19;

import model.ListNode;
import wsj.code19;

public class Solution {

    public static  ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode(-1);
        newHead.next=head;
        ListNode left = newHead, right = newHead;
        for (int i = 0; i <= n && right != null; i++) {
            right = right.next;
        }
        while (right != null) {
            left = left.next;
            right = right.next;
        }
        left.next = (left.next == null ? null : left.next.next);
        return newHead.next;
    }

    public static void main(String[] args) {
ListNode head=new ListNode(1);
        head.next=new ListNode(2);
//        head.next.next=new ListNode(3);
//        head.next.next.next=new ListNode(4);
//        head.next.next.next.next=new ListNode(5);
        removeNthFromEnd(head,2);
    }
}
