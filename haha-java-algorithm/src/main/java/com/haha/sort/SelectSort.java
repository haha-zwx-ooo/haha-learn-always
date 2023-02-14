package com.haha.sort;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * 选择排序
 *
 * @author zwx18
 * @version 1.0
 **/
@Slf4j
public class SelectSort {

    public static void sort(int[] arrays) {
        //选择排序就是扫描，找出最大or最小，然后交换，再次扫描，直到结束
        int min = 0;
        int start = 0;
        while (start < arrays.length) {
            for (int i = start; i < arrays.length; i++) {
                if (arrays[i] < arrays[min]) {
                    min = i;
                }
            }
            swap(arrays, start, min);
            min = ++start;
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
