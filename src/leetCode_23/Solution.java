package leetCode_23;

import model.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        ListNode newHead = new ListNode(-1), current = newHead;
        Queue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.val));
        for (ListNode list : lists) {
            if (list == null) {
                continue;
            }
            queue.offer(list);
        }
        while (!queue.isEmpty()) {
            ListNode poll = queue.poll();
            current.next = poll;
            if (poll.next != null) {
                queue.offer(poll.next);
            }
            current = current.next;
        }
        return newHead.next;
    }
}
