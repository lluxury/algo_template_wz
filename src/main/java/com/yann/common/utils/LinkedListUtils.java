package com.yann.common.utils;

import com.yann.common.classes.ListNode;

/**
 * @program: algo_template_wz
 * @description: 构建链表
 * @author: Yann
 * @create: 2019-09-13 10:06
 **/
public class LinkedListUtils {
    public static ListNode contructLinkedList(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        ListNode pre = new ListNode(-1);
        ListNode head = new ListNode(nums[0]);
        pre.next = head;
        for (int i = 1; i < nums.length; i++) {
            head.next = new ListNode(nums[i]);
            head = head.next;
        }
        return pre.next;
    }
}
