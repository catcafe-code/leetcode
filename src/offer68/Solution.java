package offer68;

import model.TreeNode;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root.left == null || root.right == null) {
            return null;
        }
        TreeNode treeNode = lowestCommonAncestor(root.left, p, q);
        if (treeNode != null) {
            return treeNode;
        }
        treeNode = lowestCommonAncestor(root.right, p, q);
        if (treeNode != null) {
            return treeNode;
        }
        if (findTreeBode(root, p) && findTreeBode(root, q)) {
            return root;
        }
        return null;
    }

    public boolean findTreeBode(TreeNode root, TreeNode node) {
       if (root == null) {
           return false;
       }
       return root == node || findTreeBode(root.left, node) || findTreeBode(root.right, node);
    }
}
