package offer58_1;

import java.util.Stack;

public class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                if (!sb.isEmpty()) {
                    stack.push(sb.toString());
                    sb = new StringBuilder();
                }
                continue;
            }
            sb.append(c);
        }
        while (!stack.isEmpty()) {
            if (!sb.isEmpty()) {
                sb.append(' ');
            }
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
