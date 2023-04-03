package offer30;

import java.util.ArrayList;
import java.util.List;

public class MinStack {
    /** initialize your data structure here. */
    List<Integer> mainData;

    List<Integer> minData;

    int lastIndex = -1;

    public MinStack() {
        mainData = new ArrayList<>();
        minData = new ArrayList<>();
    }

    public void push(int x) {
        mainData.add(x);
        if (minData.isEmpty()) {
            minData.add(x);
            lastIndex++;
            return;
        }
        Integer cureentMin = minData.get(lastIndex);
        if (x < cureentMin) {
            cureentMin = x;
        }
        minData.add(cureentMin);
        lastIndex++;
    }

    public void pop() {
        if (mainData.size() == 0) {
            return;
        }
        mainData.remove(lastIndex);
        minData.remove(lastIndex);
        lastIndex--;
    }

    public int top() {
        if (mainData.size() == 0) {
            return -1;
        }
        return mainData.get(lastIndex);
    }

    public int min() {
        if (minData.size() == 0) {
            return -1;
        }
        return minData.get(lastIndex);
    }


    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println( minStack.top());
        System.out.println( minStack.min());
    }
}
