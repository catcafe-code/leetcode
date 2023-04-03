package offer65;

public class Solution {

    public int add(int a, int b) {
        while (b != 0) {
            int cap = (a & b) << 1;
            a = a ^ b;
            b = cap;
        }
        return a;
    }
}
