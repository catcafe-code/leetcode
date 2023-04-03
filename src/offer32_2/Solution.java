package offer32_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> data = new ArrayList<>();
        if (root == null) {
            return data;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        List<Integer> row = new ArrayList<>();
        data.add(row);
        while (!queue.isEmpty()) {
            while (!queue.isEmpty()) {
                TreeNode poll = queue.poll();
                if (poll == null) {
                    break;
                }
                row.add(poll.val);
                if (poll.left != null) {
                    queue.offer(poll.left);
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                }
            }
            if (!queue.isEmpty()) {
                row = new ArrayList<>();
                data.add(row);
                queue.offer(null);
            }
        }

        return data;
    }



    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(3);
        TreeNode node9 = new TreeNode(9);
        TreeNode node20 = new TreeNode(20);
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);
        node3.left = node9;
        node3.right = node20;
        node20.left = node15;
        node20.right = node7;
        System.out.println(levelOrder(node3));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
