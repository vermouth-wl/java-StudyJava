package com.study.collection.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayDemo2 {
    public static void main(String[] args) {
        // 创建一个ArrayList对象list,可以使用ArrayList<String>之类的泛型类
        ArrayList<String> list = new ArrayList();

        // 对list加值
        list.add("苦艾酒");
        list.add("2");
        list.add("贝尔摩德");

        // 遍历list
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext();){
            String s = iterator.next();
            System.out.println(s);
        }

    }
}
