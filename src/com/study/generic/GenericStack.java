package com.study.generic;

import java.util.ArrayList;

/**
 * @Classname GenericStack
 * @Description TODO GenericStack类封装了栈的存储，并提供使用该栈的操作
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-05-29 22:51
 * @Version 1.0
 **/
public class GenericStack<E> {

    private ArrayList<E> list = new ArrayList<E>();

    // 返回栈中的元素数目
    public int getSize() {
        return list.size();
    }

    // 返回栈顶元素
    public E peek() {
        return list.get(list.size() - 1);
    }

    // 添加一个新元素到栈顶
    public void push(E o) {
        list.add(o);
    }

    // 返回并移除一个栈顶元素
    public E pop() {
        E o = list.get(list.size() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    // 如果栈为空，返回true
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

    public static void main(String[] args) {
        GenericStack<String> stringGenericStack = new GenericStack<>();
        System.out.println("---------------");
        System.out.println("stringGenericStack的元素个数为： " + stringGenericStack.getSize());
        System.out.println(stringGenericStack.isEmpty());
        stringGenericStack.push("贝尔摩得");
        stringGenericStack.push("苦艾酒");
        stringGenericStack.push("雪莉");
        System.out.println("stringGenericStack的元素个数为： " + stringGenericStack.getSize());
        System.out.println("stringGenericStack的栈顶元素为: " + stringGenericStack.peek());
        stringGenericStack.pop();
        System.out.println("stringGenericStack的元素个数为： " + stringGenericStack.getSize());
        System.out.println("stringGenericStack的栈顶元素为: " + stringGenericStack.peek());
    }
}
