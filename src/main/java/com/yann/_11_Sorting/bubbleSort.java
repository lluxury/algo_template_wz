package com.yann._11_Sorting;

import java.util.Arrays;

/**
 * @program: algo_template_wz
 * @description:
 * @author: Yann
 * @create: 2019-09-09 14:51
 **/
public class bubbleSort {
    public static class Solution1 {

        //    public static <AnyType extends Comparable<? super AnyType>> void bubbleSort(AnyType a){;
        public static <AnyType extends Comparable<? super AnyType>> void bubbleSort(AnyType[] a) {
            for (int i = 0; i < a.length; i++)
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i].compareTo(a[j]) > 0) {  // a[j]与a[i]的字符的ascii码差值小于0
                        AnyType temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
        }

    }
}
//    public static void main(String[] args) {
//        Integer[] date = new Integer[]{ 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
//        bubbleSort(date);
//        System.out.println(Arrays.toString(date));
//    }
//}
