package leetCode_114;

import model.TreeNode;

public class Solution {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.left);
        flatten(root.right);

        if (root.left == null) {
            return;
        }
        TreeNode right = root.right;
        root.right = root.left;
        root.left = null;
        if (right == null) {
            return;
        }
        TreeNode tmp = root.right;
        while (tmp.right != null) {
            tmp = tmp.right;
        }
        tmp.right = right;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        node1.left = node2;
        new Solution().flatten(node1);
    }
}
