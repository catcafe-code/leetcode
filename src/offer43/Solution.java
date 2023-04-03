package offer43;

public class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        int mul = 1;
        while (n >= mul) {
            count += (n / (mul * 10)) * mul + Math.min(Math.max(n % (10 * mul) - mul + 1, 0), mul);
            mul *= 10;
        }
        return count;
    }
}
