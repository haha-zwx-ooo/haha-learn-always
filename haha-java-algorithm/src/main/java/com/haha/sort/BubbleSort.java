package com.haha.sort;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author zwx18
 * @version 1.0
 **/
@Slf4j
public class BubbleSort {

    public static void sort(int[] arrays) {
        //冒泡排序就是比较相邻的二个元素大小，并交换位置
        for (int i = 0; i < arrays.length; i++) {
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[i] < arrays[j]) {
                    swap(arrays, i, j);
                }
            }
        }
    }

    public static void swap(int[] arrays, int x, int y) {
        int tmp = arrays[x];
        arrays[x] = arrays[y];
        arrays[y] = tmp;
    }


    public static void main(String[] args) {
        int[] arrays = new int[]{10, 15, 5, 2, 6, 8, 55, 30};
        System.out.println(Arrays.toString(arrays));
        sort(arrays);
        System.out.println(Arrays.toString(arrays));
    }
}
