package leetCode_106;

import model.TreeNode;

public class Solution {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    public TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
        if (postStart > postEnd) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[postEnd]);
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == root.val) {
                root.left = buildTree(inorder, inStart,  i- 1, postorder,  postStart, postStart + i - inStart - 1);
                root.right = buildTree(inorder, i + 1, inEnd, postorder,postStart + i - inStart, postEnd - 1);
            }
        }
        return root;
    }
}
