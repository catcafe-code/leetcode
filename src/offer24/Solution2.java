package offer24;

/**
 * 刚说没有反转链表，里面来了
 *
 */
public class Solution2 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = this.reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

    }

}
