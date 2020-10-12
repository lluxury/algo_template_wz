package com.yann._11_Sorting;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class insertionSortTest {

    private static insertionSort.Solution1 solution1;
    private static Integer[] nums;
    private static Integer[] expected;
    private static Integer[] actual;

    @BeforeClass
    public static void before() {
        solution1 = new insertionSort.Solution1();
    }

    @Test
    public void test1() {
//      Integer[] data = new Integer[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        nums = new Integer[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        expected = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        solution1.insertSort(nums);
//      assertArrayEquals(expected, actual); 函数没有输出值,所以不能带入函数比
        assertArrayEquals(expected, nums);

    }
}