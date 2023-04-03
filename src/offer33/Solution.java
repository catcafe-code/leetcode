package offer33;

public class Solution {

    public boolean verifyPostorder(int[] postorder) {
        if (postorder.length <= 1) {
            return true;
        }
        for (int i = 1; i < postorder.length ; i += 2) {
            if (postorder[i] < postorder[i -1]) {
                return false;
            }
            if (i + 1 < postorder.length && postorder[i] < postorder[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().verifyPostorder(new int[] {4, 8, 6, 12, 16, 14, 10}));
    }
}
