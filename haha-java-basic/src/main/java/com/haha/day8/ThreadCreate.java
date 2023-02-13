package com.haha.day8;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程的方式
 *
 * @author zwx18
 * @version 1.0
 **/
@Slf4j
public class ThreadCreate {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread t1 = new ThreadA();
        Thread t2 = new Thread(new ThreadB());
        FutureTask<String> futureTask = new FutureTask<>(new ThreadC());
        Thread t3 = new Thread(futureTask);
        t1.start();
        t2.start();
        t3.start();
        String s = futureTask.get();
        System.out.println(s);
    }


    static class ThreadA extends Thread {
        @Override
        public void run() {
            System.out.println("thread方式创建线程");
        }
    }

    static class ThreadB implements Runnable {
        @Override
        public void run() {
            System.out.println("Runnable方式创建线程");
        }
    }

    static class ThreadC implements Callable<String> {
        @Override
        public String call() throws Exception {
            System.out.println("Callable方式创建线程");
            return "hello world";
        }
    }
}
