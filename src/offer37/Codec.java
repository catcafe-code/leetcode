package offer37;

import model.TreeNode;

import java.util.*;

public class Codec {

    public String serialize(TreeNode root) {
        StringBuilder str = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            if (poll == null) {
                str.append(",null");
                continue;
            }
            str.append(",").append(poll.val);
            queue.offer(poll.left);
            queue.offer(poll.right);
        }
        return str.delete(0,1).toString();
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || "null".equals(data)) {
            return null;
        }
        String[] split = data.split(",");
        TreeNode head = new TreeNode(Integer.valueOf(split[0]));
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offerLast(head);
        for (int i = 1; i < split.length - 1 && !deque.isEmpty(); i = i + 2) {
            TreeNode treeNode = deque.pollFirst();
            String left = split[i];
            String right = split[i+1];
            if (!"null".equals(left)) {
                treeNode.left = new TreeNode(Integer.valueOf(left));
                deque.offerLast(treeNode.left);
            }
            if (!"null".equals(right)) {
                treeNode.right = new TreeNode(Integer.valueOf(right));
                deque.offerLast(treeNode.right);
            }
        }
        return head;
    }


    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node21 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node5.left = node2;
        node5.right = node3;
        node3.left = node21;
        node3.right = node4;
        node21.left = new TreeNode(3);
        node21.right = new TreeNode(1);
        String str = new Codec().serialize(node5);
        TreeNode newNode = new Codec().deserialize(str);
        System.out.println(1111);
    }
}
