package offer09;

import java.util.Stack;

public class CQueue {

    Stack<Integer> stackA = new Stack<>();
    Stack<Integer> stackB = new Stack<>();

    public CQueue() {

    }

    public void appendTail(int value) {
        stackA.push(value);
    }

    public int deleteHead() {
        if (stackB.isEmpty()) {
            resverStack();
        }
        if (stackB.isEmpty()) {
            return -1;
        }
        return stackB.pop();
    }

    private void resverStack() {
        while (!stackA.isEmpty()) {
            stackB.push(stackA.pop());
        }
    }

    public static void main(String[] args) {
        CQueue obj = new CQueue();
        obj.appendTail(3);
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
    }
}
