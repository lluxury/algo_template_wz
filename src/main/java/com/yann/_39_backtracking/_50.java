package com.yann._39_backtracking;

/**
 * @program: algo_template_wz
 * @description:
 * @author: Yann
 * @create: 2019-07-27 23:55
 **/
public class _50 {

    public static class Solution1 {
        /**
         * Time: O(logn)
         * Space: O(logn)
         * 下面是静态内部类
         * 不可以访问外部类的实例属性和方法
         */
        public double myPow(double x, int n) {
            long N = n;
            if (N < 0) {
                x = 1 / x;
                N = -N;
            }
            return fastPow(x, N);
        }

        private double fastPow(double x, long n) {
            if (n == 0) {
                return 1.0;
            }
            double half = fastPow(x, n / 2);
            if (n % 2 == 0) {
                return half * half;
            } else {
                return half * half * x;
            }
        }
    }

    public static class Solution2 {
        /**
         * Time: O(logn)
         * Space: O(1)
         */
        public double myPow(double x, int n) {
            long N = n;
            if (N < 0) {
                x = 1 / x;
                N = -N;
            }
            double answer = 1;
            double currentProduct = x;
            for (long i = N; i > 0; i /= 2) {
                if (i % 2 == 1) {
                    answer = answer * currentProduct;
                }
                currentProduct *= currentProduct;
            }
            return answer;
        }
    }
}
