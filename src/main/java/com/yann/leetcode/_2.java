package com.yann.leetcode;

import com.yann.common.classes.ListNode;

/**
 * @program: algo_template_wz
 * @description: 链表相加
 * @author: Yann
 * @create: 2019-09-13 09:32
 **/
public class _2 {
    public static class Solution1 {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode result = new ListNode(0);
            ListNode tmp = result;
            int sum = 0;
            while (l1 != null || l2 != null) {
                sum /= 10;
                if (l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }
                if (l2 != null) {
                    sum += l2.val;
                    l2 = l2.next;
                }
                tmp.next = new ListNode(sum % 10);
                tmp = tmp.next;
            }
            if (sum / 10 == 1) {
                tmp.next = new ListNode(1);
            }
            return result.val == 0 ? result.next : result;
        }
    }

}
