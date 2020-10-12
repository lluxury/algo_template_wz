package com.yann.leetcode;

/**
 * @program: algo_template_wz
 * @description:
 * @author: Yann
 * @create: 2019-09-14 11:38
 **/
public class _5 {
    public static class Solution1{
        private int low;
        private int maxLen;

        public String longestPalindrome(String s){
            int len = s.length();
            if (len < 2){
                return s;
            }

            for (int i = 0; i < len - 1; i++) {
                extenPalindrome(s,i,i);
                extenPalindrome(s,i,i+1);
            }
            return  s.substring(low, low + maxLen);
        }

        private void extenPalindrome(String s, int left, int right){
            while (left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                left --;
                right++;
            }
            if (maxLen < right - left -1){
                low = left +1;
                maxLen = right - left -1;
            }
        }
    }
}
