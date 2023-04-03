package offer54;

import model.TreeNode;

public class Solution {

    int k, res;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }

   void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.right);
        if (--k == 0) {
            res = root.val;
            return;
        }
        dfs(root.left);
   }
}
