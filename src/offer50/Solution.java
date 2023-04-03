package offer50;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public char firstUniqChar(String s) {
        Map<Byte, Integer> count = new HashMap<>();
        for (byte aByte : s.getBytes()) {
            Integer integer = count.getOrDefault(aByte, 0);
            count.put(aByte, ++integer);
        }
        for (byte aByte : s.getBytes()) {
            Integer integer = count.get(aByte);
            if (integer == 1) {
                return (char) aByte;
            }
        }
        return ' ';
    }
}
