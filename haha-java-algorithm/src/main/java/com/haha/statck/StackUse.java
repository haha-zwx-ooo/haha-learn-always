package com.haha.statck;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zwx18
 * @version 1.0
 **/
@Slf4j
public class StackUse {
    public static void main(String[] args) {
        String str = "hello world";
        //1. 单词逆序
        MyStack<Character> myStack = new MyStack<>(str.length());
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            myStack.push(chars[i]);
        }
        System.out.println(str);
        for (int i = 0; i < chars.length; i++) {
            Character pop = myStack.pop();
            System.out.print(pop);
        }

        //2. 分隔符匹配 '{[]}'
        str = "{a[f{e'133[fl[]'}]}";
        myStack = new MyStack<>(str.length());
        char[] chars1 = str.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] == '['
                    ||
                    chars1[i] == '{'
                    ||
                    chars1[i] == '\''
            ) {
                myStack.push(chars1[i]);
            }
        }
    }
}
