package com.haha.day4;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zwx18
 * @version 1.0
 **/
@Slf4j
public class Operation2 {
    public static void main(String[] args) {
        //++
        //--
        int a = 1;
        int b = ++a;
        System.out.println(b);
        a = 1;
        int c = a++;
        System.out.println(c);
    }
}
