package offer11;

public class Solution2 {
    public int minArray(int[] numbers) {
        int left = 0,  right = numbers.length - 1;
        while (left < right) {
            int middle = (left + right) / 2;
            if (numbers[middle] < numbers[right]) {
                right = middle;
            }else if (numbers[middle] > numbers[right]) {
                left = middle + 1;
            }else {
                right--;
            }
        }
        return numbers[left];
    }
}
