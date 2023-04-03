package offer26;

public class Solution {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return A == B;
        }
        return isContain(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean isContain(TreeNode a, TreeNode b) {
        if (b == null) {
            return true;
        }
        if (a == null) {
            return false;
        }
        if (a.val != b.val) {
            return false;
        }
        return isContain(a.left, b.left) && isContain(a.right, b.right);
    }

    public static class TreeNode {
          int val;
    TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }

}
