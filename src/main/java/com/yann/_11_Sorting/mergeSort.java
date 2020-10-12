package com.yann._11_Sorting;

import java.util.Arrays;

/**
 * @param a        an array of Comparable items.
 * @param tmpArray an array to place the merged result.
 * @param left     the left-most index of the subarray.
 * @param right    the right-most index of the subarray.
 * @program: algo_template_wz
 * Internal method that makes recursive calls.
 * @description: 了解, 还没写test
 * @author: Yann
 * @create: 2019-09-05 13:28
 **/

public class mergeSort {
    public static class Solution1 {
        private static <AnyType extends Comparable<? super AnyType>>
        void mergeSort(AnyType[] a, AnyType[] tmpArray, int left, int right) {
            if (left < right) {
                int center = (left + right) / 2;
                mergeSort(a, tmpArray, left, center);
                mergeSort(a, tmpArray, center + 1, right);
                merge(a, tmpArray, left, center + 1, right);

            }
        }


        public static <AnyType extends Comparable<? super AnyType>>
        void mergeSort(AnyType[] a) {
//        AnyType [ ] tmpArray = (AnyType[] new Comparable[ a, length] x);
            AnyType[] tmpArray = (AnyType[]) new Comparable[a.length];
            mergeSort(a, tmpArray, 0, a.length - 1);
        }


        /**
         * Internal method that merges two sorted halves of a subarray.
         *
         * @param a        an array of Comparable items.
         * @param tmpArray an array to place the merged result.
         * @param leftPos  the left-most index of the subarray.
         * @param rightPos the index of the start of the second half.
         * @param rightEnd the right-most index of the subarray.
         */

        private static <AnyType extends Comparable<? super AnyType>>
        void merge(AnyType[] a, AnyType[] tmpArray,
                   int leftPos, int rightPos, int rightEnd) {
            int leftEnd = rightPos - 1;
            int tmpPos = leftPos;
            int numElements = rightEnd - leftPos + 1;


            while (leftPos <= leftEnd && rightPos <= rightEnd)
                if (a[leftPos].compareTo(a[rightPos]) <= 0)
                    tmpArray[tmpPos++] = a[leftPos++];
                else
                    tmpArray[tmpPos++] = a[rightPos++];

            while (leftPos <= leftEnd)
                tmpArray[tmpPos++] = a[leftPos++];
            while (rightPos <= rightEnd)
                tmpArray[tmpPos++] = a[rightPos++];

            for (int i = 0; i < numElements; i++, rightEnd--)
                a[rightEnd] = tmpArray[rightEnd];
        }
    }
    public static void main(String[] args) {
        Integer[] date = new Integer[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Solution1.mergeSort(date);
        System.out.println(Arrays.toString(date));

    }
}
