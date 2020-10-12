package com.yann._11_Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: algo_template_wz
 * @description:
 * @author: Yann
 * @create: 2019-09-06 18:26
 **/
public class quickSort {
    public static <AnyType extends Comparable<? super AnyType>> void quickSort(AnyType[] a) {
        quickSort(a, 0, a.length - 1);
    }

    private static <AnyType extends Comparable<? super AnyType>> void quickSort(AnyType[] a, int low, int high) {
        if (low < high) {
            int keyPos = partition(a, low, high);
            quickSort(a, low, keyPos - 1);
            quickSort(a, keyPos + 1, high);
        }
    }

    private static <AnyType extends Comparable<? super AnyType>> int partition(AnyType[] a, int low, int high) {
        AnyType key = median3(a, low, high);
        while (low < high) {
            while (low < high && a[high].compareTo(key) >= 0)
                --high;
            a[low] = a[high];

            while (low < high && a[low].compareTo(key) <= 0)
                ++low;
            a[high] = a[low];
        }
        a[low] = key;
        return low;
    }


    public static <AnyType extends Comparable<? super AnyType>> AnyType median3(
            AnyType[] a, int low, int high) {
        int mid = (low + high) / 2;
        if (a[low].compareTo(a[mid]) > 0) {
            AnyType temp = a[low];
            a[low] = a[mid];
            a[mid] = temp;
        }
        if (a[mid].compareTo(a[high]) > 0) {
            AnyType temp = a[mid];
            a[mid] = a[high];
            a[high] = temp;
        }
        if (a[low].compareTo(a[mid]) > 0) {
            AnyType temp = a[low];
            a[low] = a[mid];
            a[mid] = temp;
        }
        AnyType tem = a[low];
        a[low] = a[mid];
        a[mid] = tem;
        return a[low];
    }

    public static void main(String[] args) {
        Integer[] date = new Integer[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        quickSort(date);
        System.out.println(Arrays.toString(date));

    }
}
