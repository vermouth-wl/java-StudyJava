package com.study.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Classname TestIterator
 * @Description TODO 在数组线性表中使用迭代器Iterator来遍历元素
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-05-30 23:41
 * @Version 1.0
 **/
public class TestIterator {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("重庆");
        collection.add("北京");
        collection.add("天津");
        collection.add("上海");

        // 使用迭代器Iterator来进行遍历
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 使用for循环来进行遍历
        for (String elements : collection) {
            System.out.print(elements + " ");
        }
        System.out.println();

        // java8中提供forEach()方法来遍历(常用)
        collection.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}
