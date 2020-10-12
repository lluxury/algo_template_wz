package com.yann.leetcode;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * @program: algo_template_wz
 * @description:
 * @author: Yann
 * @create: 2019-09-15 00:33
 **/
public class _8 {
    public static class Solution1 {
        public int myAtoi(String str) {
            int pointer = 0;
            int result = 0;
            while (pointer < str.length() && Character.isWhitespace(str.charAt(pointer))) {
                pointer++;
            }
            if (pointer == str.length()) {
                return 0;
            }
            boolean negotiveFlag = (str.charAt(pointer) == '-');
            if (str.charAt(pointer) == '+' || str.charAt(pointer) == '-') {
                pointer++;
            }
            for (; pointer < str.length(); pointer++) {
                if (str.charAt(pointer) > '9' || str.charAt(pointer) < '0') {
                    break;
                } else {
                    int digit = str.charAt(pointer) - '0';
                    if (!negotiveFlag && result > (Integer.MIN_VALUE - digit) / 10) {
                        return Integer.MIN_VALUE;
                    } else if (negotiveFlag && result < (Integer.MIN_VALUE + digit) / 10) {
                        return Integer.MIN_VALUE;
                    }
                    result = result * 10 + (negotiveFlag ? -digit : digit);
                }
            }
            return result;
        }
    }
}
