package com.haha.day2;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zwx18
 * @version 1.0
 **/
@Slf4j
public class DataType {
    public static void main(String[] args) {
        //TODO: 首先 计算机基本单位是bit 1个字节byte=8bit
        //bit 是二进制保存的 0000 0000
        //1. java 分2类数据类型
        //1.1 基础数据类型
        //1.1.1 boolean  --true false  默认值是false
        boolean flag = false;
        System.out.println(flag);
        //1.1.2 short 2字节=2*8=16bit 除去符号位就是 2^15范围
        short s = 0;
        System.out.println(s);
        //1.1.3 int 4字节=4*8=32bit 除去符号位就是 2^31范围
        int i = 0;
        System.out.println(i);
        //1.1.4 long 8字节=8*8=64bit 除去符号位就是2^64范围
        long l = 0;
        System.out.println(l);
        //1.1.5 float 4字节=4*8=32bit 除去符号位就是2^31范围
        float f = 0;
        System.out.println(f);
        //1.1.6 double 8字节 所以精度高于float
        double d = 0;
        System.out.println(d);
        //1.1.7 char 2字节
        char c = 0;
        System.out.println(c);
        //1.1.8 byte 本身就是字节 8bit 所以范围就是 2^7 - 1
        byte b = 0;
        System.out.println(b);

        //基本数据类型 存储在栈上

        //1.2 引用数据类型
        String str = "1";
        System.out.println(str);

        //引用数据类型的引用在栈上
        //实际对象存在在堆上
    }
}
