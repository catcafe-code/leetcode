package leetCode_654;

import model.TreeNode;

public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums, 0, nums.length - 1);
    }

    public TreeNode constructMaximumBinaryTree(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int max = nums[left];
        int maxPoint = left;
        for (int i = left + 1; i <= right; i++) {
            if (nums[i] > max) {
                maxPoint = i;
                max = nums[i];
            }
        }
        TreeNode root = new TreeNode(max);
        root.left = constructMaximumBinaryTree(nums, left, maxPoint - 1);
        root.right = constructMaximumBinaryTree(nums, maxPoint + 1, right);
        return root;
    }
}
