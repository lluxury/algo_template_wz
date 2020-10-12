package com.yann.leetcode;

import org.junit.Before;
import org.junit.Test;
import sun.nio.cs.ArrayEncoder;

import static org.junit.Assert.*;

public class _1Test {
    private static _1.Solution1 solution1;
    private static int[] nums;
    private static int[] expected;
    private static int target;

    @Before
    public void setUp() throws Exception {
        solution1 = new _1.Solution1();
        nums = new int[]{2, 7, 11, 15};
        target = 9;
    }

    @Test
    public void test1(){
        expected = new int[]{0,1};
        assertArrayEquals(expected,solution1.twoSum(nums,target));
    }
}