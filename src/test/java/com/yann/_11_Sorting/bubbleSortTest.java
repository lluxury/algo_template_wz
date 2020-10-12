package com.yann._11_Sorting;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class bubbleSortTest {
    private static bubbleSort.Solution1 solution1;
    private static Integer[] nums;
    private static Integer[] expected;
    private static Integer[] actual;

    @BeforeClass
    public static  void setUp() throws Exception {
        solution1 = new bubbleSort.Solution1();
    }

    @Test
    public void test1(){
        nums = new Integer[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        expected = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        solution1.bubbleSort(nums);
        assertArrayEquals(expected,nums);
    }
}