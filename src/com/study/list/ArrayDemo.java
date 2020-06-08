package com.study.list;

import java.util.Arrays;

public class ArrayDemo {
    /**
     * 数组输出方式
     * @param args
     */
    public static void main(String[] args) {

        //方式一
        int[] ns = {1, 3, 5, 7, 9};
        for (int i = 0; i < ns.length; i++) {
            int n = ns[i];
            System.out.println("索引号: " + i + ", 值为: " + n);
        }
        System.out.println();
        //方式二, for each输出，但是无法输出下标
        String[] name = {"苦艾酒", "贝尔摩德"};
        for (String n : name) {
            System.out.println(n);
        }
        System.out.println();
        //方法三，直接使用Arrays.toString()方法打印
        int[] age = {21, 22, 23};
        System.out.println(Arrays.toString(age));
        System.out.println();
        int[] apples = {12, 13, 14, 15};
        for (int i = apples.length-1; i >= 0; i--) {
            int apple = apples[i];
            System.out.println("索引号: " + i + ", 值为: " + apple);
        }
    }
}
