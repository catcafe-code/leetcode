package wsj;

import java.util.HashSet;

public class code141 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    public static boolean hasCycle(ListNode head) {
        ListNode l1=head;
        ListNode l2=head;
        while(l1!=null&&l1.next!=null){
            l1=l1.next.next;
            l2=l2.next;
            if(l1==l2){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //[-21,10,17,8,4,26,5,35,33,-7,-16,27,-12,6,29,-12,5,9,20,14,14,2,13,-24,21,23,-21,5]
        ListNode head=new ListNode(-21);
        head.next=new ListNode(10);
        head.next=new ListNode(17);
        head.next=new ListNode(8);
        head.next=new ListNode(4);
        head.next=new ListNode(26);
        head.next=new ListNode(5);
        head.next=new ListNode(35);
        head.next=new ListNode(33);
        head.next=new ListNode(-7);
        head.next=new ListNode(-16);
        head.next=new ListNode(27);
        head.next=new ListNode(-12);
        head.next=new ListNode(6);
        head.next=new ListNode(29);
        head.next=new ListNode(-12);
        head.next=new ListNode(5);
        head.next=new ListNode(9);
        head.next=new ListNode(20);
        head.next=new ListNode(14);
        head.next=new ListNode(14);
        head.next=new ListNode(2);
        head.next=new ListNode(13);
        head.next=new ListNode(-24);
        head.next=new ListNode(21);
        head.next=new ListNode(23);
        head.next=new ListNode(-21);
        head.next=new ListNode(5);

        System.out.println(hasCycle(head));
    }
}
