package wsj;

public class code142 {
    public static ListNode detectCycle(ListNode head) {
        ListNode l1=head;
        ListNode l2=head;
        while(l1!=null&&l1.next!=null){
            l1=l1.next.next;
            l2=l2.next;
            if(l1==l2){
                return l1.next;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        //[-21,10,17,8,4,26,5,35,33,-7,-16,27,-12,6,29,-12,5,9,20,14,14,2,13,-24,21,23,-21,5]
        ListNode head=new ListNode(1);
        ListNode head1=new ListNode(2);
//        ListNode head2=new ListNode(0);
//        ListNode head3=new ListNode(4);
        head.next=head1;
        head1.next=head;
//        head2.next=head3;
//        head3.next=head1;
        detectCycle(head);
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
