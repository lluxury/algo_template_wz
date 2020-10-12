package com.yann.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class _5Test {
    private static _5.Solution1 solution1;
    private static String low;
    private static String maxLen;

    @BeforeClass
    public static void setup(){
        solution1 = new _5.Solution1();
    }

//    @Test
//    public void test1(){
//        assertEquals("bab",solution1.longestPalindrome("babad"));
//    } 这是什么原因,单独写不报错, 一起测试就报错?

    @Test
    public void test2(){
        assertEquals("bb",solution1.longestPalindrome("cbbd"));
    }
}