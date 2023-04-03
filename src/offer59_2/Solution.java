package offer59_2;

import java.util.*;

public class Solution {
    class MaxQueue {

        private Queue<Integer> data;

        private Deque<Integer> helper;

        public MaxQueue() {
           data = new LinkedList<>();
           helper = new LinkedList<>();
        }

        public int max_value() {
           return helper.isEmpty() ? -1 : helper.peekFirst();
        }

        public void push_back(int value) {
            data.offer(value);
            while (!helper.isEmpty() && helper.peekLast() < value) {
                helper.pollLast();
            }
            helper.offerLast(value);
        }

        public int pop_front() {
            if (data.isEmpty()) {
                return -1;
            }
            Integer poll = data.poll();
            if (helper.peekFirst().equals(poll)) {
                helper.pollFirst();
            }
            return poll;
        }
    }
}
