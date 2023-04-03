package offer32_1;

import java.security.cert.CertSelector;
import java.util.*;

public class Solution {
    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        List<Integer> data = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode peek = queue.poll();
            data.add(peek.val);
            if (peek.left != null) {
                queue.offer(peek.left);
            }
            if (peek.right != null) {
                queue.offer(peek.right);
            }
        }
        int[] res = new int[data.size()];
        for (int i = 0; i < data.size(); i++) {
            res[i] = data.get(i);
        }
        return res;
    }



      public static class TreeNode {
          int val;
         TreeNode left;
         TreeNode right;
          TreeNode(int x) { val = x; }
      }

}
