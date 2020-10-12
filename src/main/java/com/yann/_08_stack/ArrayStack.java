package com.yann._08_stack;

/**
 * @program: algo_template_wz
 * @description:
 * @author: Yann
 * @create: 2019-08-03 13:18
 **/

//    public class ArrayStack {
//    //    public static class Soulution1 { Solution1
//    public static class Solution1 {
//
//        private String[] items;
//        private int count;
//        private int n;
//
//        public ArrayStack(int n) {
//            this.items = new String[n];
//            this.n = n;
//            this.count = 0;
//      }
//
//        public boolean push(String item) {
//            if (count == 0) {
//                return false;
//            }
//
//            item[count] = item;
//            ++count;
//            return true;
//        }
//
//        public String pop() {
//            if (count == 0) {
//                return null;
//            }
//            String tmp = items[count - 1];
//            --count;
//            return tmp;
//        }
//    }
//}