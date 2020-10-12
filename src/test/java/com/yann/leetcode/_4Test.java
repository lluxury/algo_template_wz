package com.yann.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class _4Test {
    private static _4.Solution1 solution1;
    private static int[] A;
    private static int[] B;
    private static Double expected;


    @BeforeClass
    public static void setup(){
        solution1 = new _4.Solution1();
    }

    @Test
    public void test1(){
        A = new int[]{1,3};
        B = new int[]{2};
//        expected = new double [2.0];
        expected = new Double("2.0");
        assertEquals(expected,solution1.findMedianSortedArrays(A,B));

    }

}