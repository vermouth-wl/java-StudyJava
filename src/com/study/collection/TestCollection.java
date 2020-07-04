package com.study.collection;

import java.util.ArrayList;

/**
 * @Classname TestCollection
 * @Description TODO 定义在Collection接口中的方法的示例
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-05-30 23:17
 * @Version 1.0
 **/
public class TestCollection {
    public static void main(String[] args) {
        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("重庆");
        collection1.add("北京");
        collection1.add("天津");
        collection1.add("上海");
        collection1.add("广州");

        System.out.println("集合1中的城市: ");
        System.out.println(collection1);
        System.out.println("\n广州是否在集合1中? " + collection1.contains("广州"));
        collection1.remove("广州");
        System.out.println("\n" + collection1.size() + "个城市现在在集合1中");

        ArrayList<String> collection2 = new ArrayList<>();
        collection2.add("成都");
        collection2.add("武汉");
        collection2.add("南京");
        collection2.add("重庆");
        System.out.println("\n集合2中的城市:");
        System.out.println(collection2);

        ArrayList<String> c1 = (ArrayList<String>) collection1.clone();
        c1.addAll(collection2);
        System.out.println("\n城市在集合1、集合2的所有元素是： ");
        System.out.println(c1);

        c1 = (ArrayList<String>) collection1.clone();
        c1.retainAll(collection2);
        System.out.println("\n城市在集合1或者集合2同时存在的元素是： ");
        System.out.println(c1);

        c1 = (ArrayList<String>)collection1.clone();
        c1.removeAll(collection2);
        System.out.println("\n城市在集合1中，但是没在集合2中: ");
        System.out.println(c1);
    }
}
