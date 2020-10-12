package com.yann.leetcode;

import java.util.Deque;
import java.util.LinkedList;


/**
 * @program: algo_template_wz
 * @description:
 * @author: Yann
 * @create: 2019-07-28 14:29
 **/
public class _456 {
//    public static Solution1{
    public static class Solution1 {
        public boolean find132pattern(int[] nums){
            Deque<Integer> stack = new LinkedList<>();

            int s3 = Integer.MIN_VALUE;
            for (int i = nums.length -1;i>=0;i--){
                if (nums[i] < s3){
                    return true;
                } else {
                    while (!stack.isEmpty() && nums[i] > stack.peek()) {
                        s3 = Math.max(s3,stack.pop());
                    }
                }
                stack.push(nums[i]);
            }
            return false;
        }
    }
}
