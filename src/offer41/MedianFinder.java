package offer41;

import java.util.*;

public class MedianFinder {

    Queue<Integer> maxQueue;
    Queue<Integer> minQueue;
    public MedianFinder() {
        maxQueue = new PriorityQueue<>();
        minQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);
    }

    public void addNum(int num) {
        if (minQueue.isEmpty() || num <= minQueue.peek()) {
            minQueue.offer(num);
            if (minQueue.size() + 1 > maxQueue.size()) {
                maxQueue.offer(minQueue.poll());
            }
        }else {
            maxQueue.offer(num);
            if (maxQueue.size() > minQueue.size()) {
                minQueue.offer(maxQueue.poll());
            }
        }
    }

    public double findMedian() {
        if (minQueue.size() > maxQueue.size()) {
            return minQueue.peek();
        }
        return (minQueue.peek() + maxQueue.peek()) / 2.0;
    }
}
