package wsj;

import java.util.Stack;

/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
public class code19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
         //倒数第N个，等于正数第legth-N+1
       ListNode l=new ListNode(-1);
        l.next=head;
        ListNode l1=l;
       for(int i=0;i<=n;i++){
           l1=l1.next;
       }
        ListNode l2=l;
       while(l1!=null){
           l1=l1.next;
           l2=l2.next;
       }
       l2.next=l2.next.next;
//        l2.next = (l2.next == null ? null : l2.next.next);
        return l.next;

    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
//        head.next.next=new ListNode(3);
//        head.next.next.next=new ListNode(4);
//        head.next.next.next.next=new ListNode(5);
        removeNthFromEnd(head,2);

    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
