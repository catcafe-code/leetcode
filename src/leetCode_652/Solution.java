package leetCode_652;

import model.TreeNode;

import java.util.*;

public class Solution {
    Map<String, TreeNode> map = new HashMap<>();

    Set<String> tree = new HashSet<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        deSerSubtrees(root);
        return new ArrayList<>(map.values());
    }

    public String deSerSubtrees(TreeNode root) {
        if (root == null) {
            return "#";
        }
        String s = root.val + "," +
                deSerSubtrees(root.left) +
                "," +
                deSerSubtrees(root.right);
        if (tree.contains(s)) {
            map.put(s, root);
        }
        tree.add(s);
        return s;
    }
}
