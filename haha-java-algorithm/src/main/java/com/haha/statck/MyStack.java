package com.haha.statck;

import lombok.extern.slf4j.Slf4j;

/**
 * 栈 先进后出 FILO
 *
 * @author zwx18
 * @version 1.0
 **/
@Slf4j
public class MyStack<T> {
    private Object[] elements;
    private int maxSize;
    private int top;

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        elements = new Object[maxSize];
        top = -1;
    }

    public void push(T element) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("栈满了");
        }
        elements[++top] = element;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈是空的");
        }
        return (T) elements[top--];
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("栈是空的");
        }
        return (T) elements[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return maxSize == top + 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = top; i >= 0; i--) {
            if (elements[i] != null) {
                sb.append(elements[i]).append(", ");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        MyStack<String> stack = new MyStack(5);
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        System.out.println(stack);
        String pop = stack.pop();
        System.out.println(pop);
        System.out.println(stack);
        String peek = stack.peek();
        System.out.println(peek);
        System.out.println(stack);
        pop = stack.pop();
        System.out.println(pop);
        System.out.println(stack);
    }
}
