package com.haha.day8;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * @author zwx18
 * @version 1.0
 **/
@Slf4j
public class WaitDemo {
    private Object obj = new Object();

    private volatile int a = 0;

    public void add() {
        for (; ; ) {
            synchronized (obj) {
                while (a == 2) {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                a++;
                System.out.println("加法" + a);
                obj.notifyAll();
            }
        }
    }

    public void alert() {
        for (; ; ) {
            synchronized (obj) {
                while (a != 2) {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                a--;
                System.out.println("减法" + a);
                obj.notifyAll();
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        WaitDemo waitDemo = new WaitDemo();
        Thread t1 = new Thread(() -> {
            waitDemo.add();
        });
        Thread t2 = new Thread(() -> {
            waitDemo.alert();
        });
        t1.start();
        t2.start();
        t1.join();
        System.out.println("main最后一行");
        t2.join();
    }
}
