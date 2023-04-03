package offer14_2;

public class Solution {
    public int cuttingRope(int n) {
        if (n <= 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int res = 1;
        while (n > 4) {
            res = ((res * 3) % 1000000007);
            n -= 3;
        }
        return (n * res) % 1000000007;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().cuttingRope(3));
    }
}
