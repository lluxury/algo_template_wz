package com.yann.leetcode;

/**
 * @program: algo_template_wz
 * @description:
 * @author: Yann
 * @create: 2019-09-13 16:50
 **/
public class _4 {
    public static class Solution1 {
//        public double findMedianSortedArrays(int[] A, int[] B) { 解决?
        public Double findMedianSortedArrays(int[] A, int[] B) {
            int m = A.length;
            int n = B.length;
            int l = (m + n + 1) / 2;
            int r = (m + n + 2) / 2;
            return (getkth(A, 0, B, 0, l) + getkth(A, 0, B, 0, r)) / 2.0;
        }

        public double getkth(int[] A, int astart, int[] B, int bstart, int k) {
            if (astart > A.length - 1) {
                return B[bstart + k - 1];
            }
            if (bstart > B.length - 1) {
                return A[astart + k - 1];
            }
            if (k == 1) {
                return Math.min(A[astart], B[bstart]);
            }
            int amid = Integer.MAX_VALUE;
            int bmid = Integer.MAX_VALUE;
            if (astart + k / 2 - 1 < A.length) {
                amid = A[astart + k / 2 - 1];
            }
            if (bstart + k / 2 - 1 < B.length) {
                bmid = B[bstart + k / 2 - 1];
            }
            if (amid < bmid) {
                return getkth(A, astart + k / 2, B, bstart, k - k / 2);
            } else {
                return getkth(A, astart, B, bstart + k / 2, k - k / 2);
            }
        }
    }
}
