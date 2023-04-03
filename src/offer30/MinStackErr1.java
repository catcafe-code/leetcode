package offer30;

import java.util.ArrayList;
import java.util.List;

/**
 * 最小值数组不需要排序，浪费时间
 */
public class MinStackErr1 {
    /** initialize your data structure here. */
    List<Integer> mainData;

    List<Integer> minData;

    public MinStackErr1() {
        mainData = new ArrayList<>();
        minData = new ArrayList<>();
    }

    public void push(int x) {
        mainData.add(x);
        int point = minData.size();
        for (int i = 0; i < minData.size(); i++) {
            if (x < minData.get(i)) {
                point = i;
                break;
            }
        }
        minData.add(point, x);
    }

    public void pop() {
        if (mainData.size() == 0) {
            return;
        }
        Integer removeData = mainData.remove(mainData.size() - 1);
        minData.remove(removeData);
    }

    public int top() {
        if (mainData.size() == 0) {
            return -1;
        }
        return mainData.get(mainData.size() - 1);
    }

    public int min() {
        if (minData.size() == 0) {
            return -1;
        }
        return minData.get(0);
    }

    public static void main(String[] args) {
        MinStackErr1 minStack = new MinStackErr1();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println( minStack.top());
        System.out.println( minStack.min());
    }
}
