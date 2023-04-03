package offer22;

import model.ListNode;

public class Solution {
    int k;

    ListNode res;

    boolean start = false;
    public ListNode getKthFromEnd(ListNode head, int k) {
        this.k = k;
        getKthFromEnd(head);
        return res;
    }

    public void getKthFromEnd(ListNode head) {
       if (head == null) {
           start = true;
           return;
       }
       getKthFromEnd(head.next);
       if (start && --k == 0) {
           res = head;
       }
       if (res != null) {
           return;
       }
    }
}
