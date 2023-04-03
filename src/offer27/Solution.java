package offer27;

import model.TreeNode;

public class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode newRight = mirrorTree(root.left);
        TreeNode newLeft = mirrorTree(root.right);
        root.left = newLeft;
        root.right = newRight;
        return root;
    }
}
