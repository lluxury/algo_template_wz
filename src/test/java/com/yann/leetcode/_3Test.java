package com.yann.leetcode;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class _3Test {
    private static _3.Solution1 solution1;
    private static _3.Solution2 solution2;
    private static _3.Solution3 solution3;
    private static String s;
    private static int expected;

    @BeforeClass
    public static void setUp() throws Exception {
        solution1 = new _3.Solution1();
        solution2 = new _3.Solution2();
        solution3 = new _3.Solution3();
    }

    @Test
    public void test1() {
        expected = 3;
        assertEquals(expected, solution1.lengthOfLongestSubstring("abcabcbb"));
        expected = 1;
        assertEquals(expected, solution1.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void test2() {
        assertEquals(3, solution2.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(3, solution2.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void test3() {
        assertEquals(3, solution3.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(3, solution3.lengthOfLongestSubstring("pwwkew"));
    }
}