package com.yann.leetcode;

import com.yann.leetcode._456;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _456Test {

    private static _456.Solution1 solution1;

    @Before
    public void setUp() throws Exception {
        solution1 = new _456.Solution1();
    }

    @Test
    public void test1(){
        assertEquals(true,solution1.find132pattern(new int[]{-1, 3, 2, 0}));
    }
}