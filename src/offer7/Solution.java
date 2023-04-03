package offer7;

import model.TreeNode;

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, 0, preorder.length, 0, inorder.length);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder, int preLeft, int preRight, int inLeft, int inRight) {
        if (preLeft >= preRight || inLeft >= inRight) {
            return null;
        }
        TreeNode current = new TreeNode(preorder[preLeft]);
        for (int i = inLeft; i < inRight; i++) {
            if (preorder[preLeft] == inorder[i]) {
                current.left = buildTree(preorder, inorder, preLeft + 1, preRight + 1 + i -inLeft, inLeft, i);
                current.right = buildTree(preorder, inorder, preLeft + 1 + i -inLeft, preRight, i + 1, inRight);
            }
        }
        return current;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7}));
    }
}
