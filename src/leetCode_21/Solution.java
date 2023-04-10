package leetCode_21;

import model.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode newHead = new ListNode(-1), current = newHead;
       while (list1 != null && list2 != null) {
           if (list1.val > list2.val) {
               current.next = list2;
               list2 = list2.next;
           }else {
               current.next = list1;
               list1 = list1.next;
           }
           current = current.next;
       }
       if (list1 != null) {
           current.next = list1;
       }
       if (list2 != null) {
           current.next = list2;
       }
       return newHead.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(4);
        ListNode n21 = new ListNode(1);
        ListNode n22 = new ListNode(3);
        ListNode n23 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n21.next = n22;
        n22.next = n23;
        System.out.println(new Solution().mergeTwoLists(n1,n21));
    }
}
