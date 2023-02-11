package com.haha.day6;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zwx18
 * @version 1.0
 **/
@Slf4j
public class MethodDemo {
    //TODO：构造方法，普通方法，静态方法，方法块,抽象方法
    {
        //方法块
        System.out.println("总是先执行");
    }

    MethodDemo() {
        super();
        System.out.println("构造方法");
    }

    public void see() {
        System.out.println("普通方法");
    }

    public static void out() {
        System.out.println("静态方法");
    }

//    abstract void eat();

    public static void main(String[] args) {
        MethodDemo methodDemo = new MethodDemo();
        methodDemo.see();
        MethodDemo.out();
    }
}
