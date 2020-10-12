package com.yann._11_Sorting;

import java.util.Arrays;

/**
 * @program: algo_template_wz
 * @description:
 * @author: Yann
 * @create: 2019-09-04 18:15
 **/
public class insertionSort {
    public static class Solution1 {
        public static <AnyType extends Comparable<? super AnyType>> void insertSort(AnyType[] a) {
            int j;

            for (int p = 1; p < a.length; p++) {
                AnyType tmp = a[p];
                for (j = p; j > 0 && tmp.compareTo(a[j - 1]) < 0; j--)
                    a[j] = a[j - 1];
                a[j] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        Integer[] data = new Integer[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//        Integer[] data1 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 7, 8, 10};
        Integer[] data1 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Solution1.insertSort(data);
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.equals(data, data1));
    }


}
