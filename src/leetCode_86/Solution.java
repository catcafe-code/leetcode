package leetCode_86;

import model.ListNode;

public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode leftHead = new ListNode(-1), left = leftHead;
        ListNode rightHead = new ListNode(-1), right = rightHead;
        while (head != null) {
            if (head.val < x) {
                left.next = head;
                left = left.next;
            }else {
                right.next = head;
                right = right.next;
            }
            head = head.next;
        }
        right.next = null;
        left.next = rightHead.next;
        return leftHead.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(1);
        n1.next = n2;
        System.out.println(new Solution().partition(n1, 2));
    }
}
