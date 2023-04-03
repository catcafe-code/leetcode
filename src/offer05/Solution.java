package offer05;

import java.util.List;

public class Solution {
    public String replaceSpace(String s) {
        if (s == null) {
            return null;
        }
        char[] chars = s.toCharArray();
        StringBuilder sBuilder = new StringBuilder();
        for (char aChar : chars) {
            if (aChar == ' ') {
                sBuilder.append("%20");
                continue;
            }
            sBuilder.append(aChar);
        }
        return sBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new String(new char[10]));
    }
}
