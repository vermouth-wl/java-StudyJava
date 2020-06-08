package com.study.generic;

/**
 * @Classname GenericMethodDemo
 * @Description TODO 定义一个泛型方法来打印数组
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-05-29 23:14
 * @Version 1.0
 **/
public class GenericMethodDemo {

    // 定义方法
    public static <E> void print(E[] list) {
        for (int i = 0; i < list.length; i++ ){
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        GenericMethodDemo genericMethodDemo = new GenericMethodDemo();
        String[] strings = {"苦艾酒", "贝尔摩得", "王磊"};
        Integer[] integers = {1, 8, 4, 2, 3, 5, 7, 4, 1, 7, 1};

        genericMethodDemo.<String>print(strings);
        genericMethodDemo.<Integer>print(integers);
    }
}
