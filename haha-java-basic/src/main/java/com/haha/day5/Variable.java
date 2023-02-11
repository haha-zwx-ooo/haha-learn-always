package com.haha.day5;

import lombok.extern.slf4j.Slf4j;

/**
 * 变量
 *
 * @author zwx18
 * @version 1.0
 **/
@Slf4j
public class Variable {
    //成员变量 分配在堆上，有访问修饰符，默认是default
    int aa = 1;

    //静态变量，生命周期是 app 级别的，分配在方法区
    static int aaa = 1;
    //常量，生命周期是app 级别的，分配在方法区
    static final int aaaa = 1;

    public static void main(String[] args) {
        //TODO: 局部变量 在方法内部声明初始化的变量，分配在栈上，方法结束就销毁
        int a = 1;

    }
}
