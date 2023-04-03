package offer40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] res = new int[k];
        if (k == 0) {
            return res;
        }
        MinHeap heap = new MinHeap();
        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                heap.offer(arr[i]);
                continue;
            }
            if (heap.peek() > arr[i]) {
                heap.poll();
                heap.offer(arr[i]);
            }
        }
        for (int i = 0; i < k; i++) {
            res[i] = heap.poll();
            ;
        }
        return res;
    }

    public static class MinHeap {
        private List<Integer> data = new ArrayList<>();

        public void offer(Integer integer) {
            data.add(integer);

        }
        public Integer poll() {
            Integer ele = null;
            if (data.size() > 0) {
                exchange(0, data.size() -1);
                ele = data.remove(data.size() - 1);
                comeDown(0);
            }
            return ele;
        }

        public Integer peek() {
            if (data.size() > 0) {
                return data.get(0);
            }
            return null;
        }

        private void comeUp(int pos) {
            int parPos =  (pos - 1) / 2;
            if (parPos == pos) {
                return;
            }
            if (compare(pos, parPos)) {
                exchange(pos, parPos);
                comeUp(parPos);
            }
        }

        private void comeDown(int pos) {
            int leftPos = 2 * pos + 1;
            int rightPos = 2 * pos + 2;
            if (data.size() <= leftPos) {
                return;
            }
            int maxChild = leftPos;
            if (data.size() > rightPos && compare(rightPos, leftPos)) {
                maxChild = rightPos;
            }
            if (compare(maxChild, pos)) {
                exchange(maxChild, pos);
                comeDown(maxChild);
            }
        }

        private boolean compare(int childPos, int parPos) {
            return data.get(childPos) > data.get(parPos);
        }

        private void exchange(int childPos, int parPos) {
            int temp = data.get(parPos);
            data.set(parPos, data.get(childPos));
            data.set(childPos, temp);
        }

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().getLeastNumbers(new int[]{0,0,1,2,4,2,2,3,1,4}, 8)));
    }
}
