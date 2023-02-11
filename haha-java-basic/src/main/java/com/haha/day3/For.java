package com.haha.day3;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zwx18
 * @version 1.0
 **/
@Slf4j
public class For {
    public static void main(String[] args) {

        //普通for循环
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("❤");
            }
            System.out.println("");
        }

        //for-each循环
        String[] strings = new String[]{"1", "2", "3"};
        for (String s : strings) {
            System.out.println(s);
        }

        //无线for循环
        for (; ; ) {
            System.out.println("死循环了");
        }
    }
}
