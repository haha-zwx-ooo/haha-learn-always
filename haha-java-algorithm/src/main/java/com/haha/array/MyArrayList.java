package com.haha.array;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zwx18
 * @version 1.0
 **/
@Slf4j
public class MyArrayList<E> {
    private Object[] elements;
    private int size;

    private int defaultSize = 10;

    public MyArrayList() {
        elements = new Object[defaultSize];
    }

    public MyArrayList(int size) {
        elements = new Object[size];
    }

    public void add(E element) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("数组满了" + size);
        }
        elements[size++] = element;
    }

    public void remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IndexOutOfBoundsException("下标越界" + index);
        }
        if (isEmpty()) {
            return;
        }
        /**
         * src:源数组;
         * srcPos:源数组要复制的起始位置;
         * dest:目的数组;
         * destPos:目的数组放置的起始位置;
         * length:复制的长度.
         */
        System.arraycopy(elements, index, elements, index - 1, size - index);
        elements[--size] = null;
    }

    public void update(int index, E element) {
        elements[index] = element;
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == elements.length;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object element : elements) {
            if (element != null) {
                sb.append(element.toString()).append(", ");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        MyArrayList<String> myArray = new MyArrayList<String>(4);
        myArray.add("1");
        myArray.add("2");
        myArray.add("3");
        myArray.add("4");
        myArray.add("5");
        System.out.println(myArray);
        System.out.println("大小： " + myArray.getSize());
        myArray.remove(2);
        System.out.println(myArray);
        System.out.println("大小： " + myArray.getSize());
        String s = myArray.get(1);
        System.out.println(s);
        myArray.update(1, "11");
        System.out.println(myArray);
    }
}
