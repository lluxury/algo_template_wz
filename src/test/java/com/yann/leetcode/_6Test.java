package com.yann.leetcode;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class _6Test {
    private static _6.Solution1 solution1;


    @BeforeClass
    public static void setUp() throws Exception {
        solution1 = new _6.Solution1();
    }

    @Test
    public void test1(){
        assertEquals("PAHNAPLSIIGYIR",solution1.convert("PAYPALISHIRING",3));
        assertEquals("AB",solution1.convert("AB",1));
    }
}