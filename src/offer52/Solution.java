package offer52;

import model.ListNode;

public class Solution {

    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }
        ListNode pointA = headA, pointB = headB;
        while (pointA != pointB) {
            pointA = pointA == null? headB : pointA.next;
            pointB = pointB == null ? headA : pointB.next;
        }
        return pointA;
    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(4);
        ListNode headB = new ListNode(5);

        ListNode node1 = new ListNode(1);
        ListNode node8 = new ListNode(8);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        ListNode node0 = new ListNode(0);

        headA.next = node0;
        node0.next = node1;
        node1.next = node8;
        node8.next = node4;
        node4.next = node5;

        headB.next = node1;
        System.out.println(new Solution().getIntersectionNode(headA, headB).val);
    }
}
