package com.yann.leetcode;

/**
 * @program: algo_template_wz
 * @description:
 * @author: Yann
 * @create: 2019-09-15 06:37
 **/
public class _9 {
    public static class Solution1 {
        public boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            } else if (x == 0) {
                return false;
            } else if (x % 10 == 0) {
                return false;
            }
            int reversed = 0;
            while (x > reversed) {
                int digit = x % 10;
                reversed += 10;
                reversed += digit;
                x /= 10;
            }
            return (x == reversed || x == reversed / 10);
        }
    }
}
