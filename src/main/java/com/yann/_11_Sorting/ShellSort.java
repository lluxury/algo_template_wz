package com.yann._11_Sorting;

import java.util.Arrays;
/**
 * @program: algo_template_wz
 * @description:
 * @author: Yann
 * @create: 2019-09-02 14:45
 **/
public class ShellSort {


//    交换方式
    public static void sort(int []arr){
        for(int gap = arr.length/2;gap>0;gap/=2)  // 隔不同间隔交换或移动
            for (int i = gap; i<arr.length;i++){
            int j = i;
            while(j-gap >=0 && arr[j]<arr[j-gap]){
                swap(arr,j,j-gap);
                j-=gap;
            }
            }
    }

//    移动方式
    public static void sort1(int []arr){
        for(int gap=arr.length/2;gap>0;gap/=2){
            for(int i=gap;i<arr.length;i++){
                int j=i;
                int temp = arr[j];
                if (arr[j]<arr[j-gap]){
                    while(j-gap>=0 && temp<arr[j-gap]){
                        arr[j]=arr[j-gap];
                        j-=gap;
                    }
                    arr[j]=temp;
                }
            }
        }
    }

    public static void swap (int []arr, int a,int b){
        arr[a] = arr[a]+arr[b];
        arr[b] = arr[a]-arr[b];
        arr[a] = arr[a]-arr[b];
    }

    public static <AnyType extends Comparable<? super AnyType>> void shellsort(AnyType [] a){
        // 一个接口, 貌似各种类型比较用
        int j;
        for (int gap = a.length/2; gap > 0;gap/=2)
            for (int i = gap; i<a.length;i++)  // 貌似学到一个技巧, 2重循环没语句,可以少写一层{ }
            {
                AnyType tmp = a[i];
                for (j = i ; j >= gap && tmp.compareTo(a[j-gap])<0;j-=gap)  // 字符串比较?
                    a[j] = a[j-gap];
                a[j] = tmp;
            }
    }

//}

    public static void main(String[] args) {
        int []arr = {1,4,2,7,9,8,3,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        int []arr1 ={1,4,2,7,9,8,3,6};
        sort1(arr1);
        System.out.println(Arrays.toString(arr1));

        Integer[] date = new Integer[]{1,4,2,7,9,8,3,6};
        shellsort(date);
        System.out.println(Arrays.toString(date));
    }
}
//这个代码库需要整理啊, 不过不会写test前,先这样做好了
//https://www.cnblogs.com/chengxiao/p/6104371.html