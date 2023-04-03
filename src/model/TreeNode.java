package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TreeNode {
    public int val;
    public   TreeNode left;
    public   TreeNode right;
    public TreeNode(int x) { val = x; }

    @Override
    public String toString() {
       List<Integer> data = new ArrayList<>();
       printNode(this, data);
       return Arrays.toString( data.toArray(new Integer[0]));
    }

    private void printNode(TreeNode node, List<Integer> data) {
        if (node == null) {
            data.add(null);
            return;
        }
        data.add(node.val);
        printNode(node.left, data);
        printNode(node.right, data);
    }
}
