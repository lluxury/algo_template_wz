package com.yann._11_Sorting;

/**
 * @program: algo_template_wz
 * @description:
 * @author: Yann
 * @create: 2019-09-15 22:59
 **/
public class countSort {
    public static int[] countSort(int[] a) {
        int[] c = new int[findMax(a) + 1];
        int[] b = new int[a.length];
        for (int i = 0; i < c.length; i++)
            c[i] = 0;
        for (int i = 0; i < a.length; i++)
            c[a[i]]++;
        int cNum = c.length - 1;
        for (int i = a.length; i >= 0; i--) {
            while (cNum >= 0 && c[(cNum)] == 0)
                cNum--;
            ;
            b[i] = cNum;
            c[cNum]--;
        }
        return b;
    }

    public static int findMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }
}
