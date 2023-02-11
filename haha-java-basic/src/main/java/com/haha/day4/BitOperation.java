package com.haha.day4;

import lombok.extern.slf4j.Slf4j;

/**
 * 位运算
 *
 * @author zwx18
 * @version 1.0
 **/
@Slf4j
public class BitOperation {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(60)); // 111100
        System.out.println(Integer.toBinaryString(13)); // 1101
        // & 如果相同位都是1 则是1 否则是0
        int a = 0;
        int b = a;
        System.out.println(Integer.toBinaryString(a)); // 0
        System.out.println(a & b);
        //|如果相同为都是0 则是0，否则是1
        System.out.println(a | b);
        //^如果相同位相同则为0，否则为1
        System.out.println(a ^ b);
    }
}
