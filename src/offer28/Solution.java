package offer28;

import model.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int currentLevelSize = queue.size();
            List<Integer> row = new ArrayList<>(currentLevelSize);
            for (int i = 0; i < currentLevelSize; i++) {
                TreeNode poll = queue.poll();
                if (poll == null) {
                    row.add(null);
                    continue;
                }
                row.add(poll.val);
                queue.offer(poll.left);
                queue.offer(poll.right);
            }
            if (!isSymmetric(row)) {
                return false;
            }
        }
        return true;
    }

    private boolean isSymmetric(List<Integer> row) {
        for (int i = 0; i < row.size() / 2; i++) {
            int endPoint = row.size() - 1 - i;
            if (row.get(i) != row.get(endPoint)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2= new TreeNode(2);
        TreeNode treeNode21 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode31 = new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode21;
        treeNode2.right = treeNode3;
        treeNode21.right = treeNode31;
        System.out.println(new Solution().isSymmetric(treeNode1));
    }
}
