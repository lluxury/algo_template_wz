package com.yann._11_Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @program: algo_template_wz
 * @description:
 * @author: Yann
 * @create: 2019-09-09 15:50
 **/
public class bucketSort {

    //    public static <AnyType extends Comparable<? super AnyType>> void quickSort(
//            AnyType[] a) {
//        quickSort(a, 0, a.length - 1);
//    }  // 直接使用私有方法了, 如果不在一个包,怎么处理?
    public static class Solution1 {
        private static <AnyType extends Comparable<? super AnyType>> void quickSort(
                AnyType[] a, int low, int high) {
            if (low < high) {
                int keyPos = partition(a, low, high);
                quickSort(a, low, keyPos - 1);
                quickSort(a, keyPos + 1, high);
            }

        }

        /**
         * 方法名：partition 说明：在原序列上进行划分，因为一个临时变量可以保存一个key，所以在key的原位置上可以插入
         * 类似在key的位置上挖坑，在找到要移动的元素，挖该元素移到这个坑里，又留下另一个坑， 不断的进行下去 直到low==down。
         */
        private static <AnyType extends Comparable<? super AnyType>> int partition(
                AnyType[] a, int low, int high) {
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


        public static void bucketSort(Integer[] a) {
            Integer[][] bucket = new Integer[10][101]; // 就输在这里了, 因为不是自己写的?
            for (int i = 0; i < 10; i++)
                bucket[i][0] = 0;

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < 10; j++) {
                    if (a[i] >= 100 * j && a[i] <= 100 * j + 99) {
                        int index = ++bucket[j][0];
                        bucket[j][index] = a[i];
                    }
                }
            }
            for (int i = 0; i < 10; i++)
                quickSort(bucket[i], 1, bucket[i][0]);

            int w = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 1; j <= bucket[i][0]; j++)
                    a[w++] = bucket[i][j];
            }
        }

//    public static void main(String[] args) {
//        Integer[] date = new Integer[]{ 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
//        bucketSort(date);
//        System.out.println(Arrays.toString(date));
//    }

        public static void main(String[] args) {
            double[] a = {0.94, 0.83, 0.79, 0.61, 0.55, 0.46, 0.33, 0.25, 0.12, 0.99, 0.002, 0.854, 0.42345};
            System.out.println("排序前的数组元素为：" + Arrays.toString(a));
            bucketSort(a, a.length);
            System.out.println("排序后的数组元素为：" + Arrays.toString(a));

        }

        private static void bucketSort(double[] a, int length) {
            ArrayList<ArrayList<Double>> list = new ArrayList<ArrayList<Double>>();
            for (int i = 0; i < a.length; i++) {
                list.add(new ArrayList<Double>());
            }
            for (int i = 0; i < length; i++) {
                list.get((int) (a[i] * length)).add(a[i]);
            }
            for (int i = 0; i < length; i++) {
                Collections.sort(list.get(i));
            }


            int index = 0;
            for (List<Double> arrayList : list) {
                for (Double d : arrayList) {
                    a[index++] = d;
                }
            }
        }


    }
}
