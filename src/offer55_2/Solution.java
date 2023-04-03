package offer55_2;

import model.TreeNode;

public class Solution {

    boolean isBalanced = true;
    public boolean isBalanced(TreeNode root) {
        depth(root);
        return isBalanced;
    }

    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int rightDepth = depth(root.right);
        int leftDepth = depth(root.left);
        if (!isBalanced) {
            return 0;
        }
        if (Math.abs(rightDepth - leftDepth) > 1) {
            isBalanced = false;
            return 0;
        }
        return Math.max(rightDepth, leftDepth) + 1;
    }

    public static void main(String[] args) {

    }
}
