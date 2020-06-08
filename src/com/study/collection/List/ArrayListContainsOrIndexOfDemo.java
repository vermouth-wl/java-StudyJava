package com.study.collection.List;

import java.util.Iterator;
import java.util.List;

public class ArrayListContainsOrIndexOfDemo {
    public static void main(String[] args) {

        // 创建一个List的泛型对象list
        List<String> list = List.of("苦艾酒", "贝尔摩德", "莎朗·温亚得");

        // 遍历list
        for (Iterator<String> iterator = list.iterator();iterator.hasNext();){
            // 打印结果
            String s = iterator.next();
            System.out.println(s);
        }

        // 使用list的contains和 indexOf()方法
        System.out.println("使用list的contains()方法返回结果为: " + list.contains("苦艾酒"));
        System.out.println("使用list的contains()方法返回结果为: " + list.contains("蓓摩得"));
        System.out.println("使用list的indexOf()方法返回结果为: " + list.indexOf("莎朗·温亚得"));
        System.out.println("使用list的indexOf()方法返回结果为: " + list.indexOf("蓓摩得"));
    }
}
