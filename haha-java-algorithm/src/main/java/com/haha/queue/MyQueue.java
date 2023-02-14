package com.haha.queue;

import lombok.extern.slf4j.Slf4j;

/**
 * 队列、、排队，先进先出FIFO
 *
 * @author zwx18
 * @version 1.0
 **/
@Slf4j
public class MyQueue<E> {
    //使用数组实现队列，要注意，数组是定长的，为了保证效率，不可能每次都复制数组，所以使用双端地址法
    private Object[] elements;
    private int front;
    private int tail;
    private int size;
    private int maxSize;

    MyQueue() {
        maxSize = 10;
        elements = new Object[maxSize];
        front = 0;
        tail = size - 1;
    }

    public void insert(E element) {
        if (isFull()) {
            throw new IllegalStateException("队列满了");
        }
        if (tail == maxSize - 1) {
            tail = -1;
        }
        elements[++tail] = element;
        size++;
    }

    public E remove() {
        if (isEmpty()) {
            throw new IllegalStateException("队列是空的");
        }
        E e = (E) elements[front++];
        if (front == maxSize) {
            front = 0;
        }
        size--;
        return e;
    }

    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("队列是空的");
        }
        return (E) elements[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        /*for (int index = front; index < size + front;
             index++) {
            if (index == maxSize - 1) {
                tmp = 0;
            }
            sb.append(elements[tmp]).append(", ");
        }*/
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.insert("1");
        myQueue.insert("2");
        myQueue.insert("3");
        myQueue.insert("4");
        System.out.println(myQueue);
    }
}
