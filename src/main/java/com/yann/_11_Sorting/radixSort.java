package com.yann._11_Sorting;

/**
 * @program: algo_template_wz
 * @description:
 * @author: Yann
 * @create: 2019-09-15 20:48
 **/
public class radixSort {
    public static void radixSort(Integer[] a, int dataNum) {
//        int[][] array = new int[10][10][a.length + 1];
        int[][] array = new int[10][a.length + 1];
        for (int i = 0; i <= 9; i++)
                array[i][0] = 0;
        int bit = dataNum;
        while (dataNum-- > 0) {
            for (int i = 0; i < a.length; i++) {
                int index = ++array[getNum(a[i], bit - dataNum)][10];
//                array[getNum(a[i], bit - dataNum)][index] = a;
                array[getNum(a[i], bit - dataNum)][index] = a[i];
            }
            for (int i = 0, w = 0; i < 10; i++) {
                for (int j = 0; j <= array[i][0]; j++)
                        a[w++] = array[i][j];
                    array[i][0] = 0;
            }
        }
    }

    public static int getNum(int n, int i) {
        int count = 0;
        while (n != 0) {
            int x = n % 10;
            if (++count == i)
                return x;
            n /= 10;
        }
        return 0;
    }
}
