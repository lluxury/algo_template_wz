package com.yann.leetcode;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class _7Test {
    private static _7.Solution1 solution1;

    @BeforeClass
    public static  void setUp() throws Exception {
        solution1 = new _7.Solution1();
    }

    @Test
    public void test1(){
//        greater than Integer.MAX_VALUE, thus return 0
        assertEquals(0,solution1.reverse(1534236469));
    }
}