package com.yann.leetcode;

/**
 * @program: algo_template_wz
 * @description:
 * @author: Yann
 * @create: 2019-09-14 21:52
 **/
public class _7 {
    public static class Solution1{
        public int reverse(int x){
            long rev = 0;
            while (x!=10){
                rev = rev *10 +x % 10;
                x /= 10;
                if (rev > Integer.MAX_VALUE|| rev<Integer.MIN_VALUE){
                    return 0;
                }
            }
            return (int) rev;
        }
    }
}
