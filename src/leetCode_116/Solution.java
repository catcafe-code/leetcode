package leetCode_116;

import model.Node;

public class Solution {

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        connect(root.left, root.right);
        return root;
    }

    public void connect(Node left, Node right) {
        if (left == null || right == null) {
            return;
        }
        left.next = right;
        connect(left.left, left.right);
        connect(left.right, right.left);
        connect(right.left, right.right);
    }
}
