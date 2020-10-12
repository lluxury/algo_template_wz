package com.yann.leetcode;

/**
 * @program: algo_template_wz
 * @description:
 * @author: Yann
 * @create: 2019-09-14 11:58
 * 2*nRows - 2, j + 2 x numRows-2 - 2 x i
 * 其实是N字型,按列遍历
 **/
public class _6 {
    public static class Solution1{
        public String convert(String s, int numRows){
            StringBuilder[] sb = new StringBuilder[numRows];
            char[] c = s.toCharArray();
            int len = s.length();
            for (int i = 0; i < numRows; i++) {
                sb[i] = new StringBuilder();
            }
            int i = 0;
            while(i < len){
                for (int index = 0; index < numRows && i < len; index++) {
                    sb[index].append(c[i++]);
                }
                for (int index = numRows - 2; index >= 1 && i < len ; index--) {
                    sb[index].append(c[i++]);
                }
            }
//            for (int i = 1; i < numRows; i++) {
            for (i = 1; i < numRows; i++) {
                sb[0].append(sb[i]);
            }
            return sb[0].toString();
        }
    }
}
