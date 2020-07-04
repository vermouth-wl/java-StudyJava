package com.study.collection.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Classname TestArrayAndLinked
 * @Description TODO 创建数组线性表和链表的测试样例
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-07-04 14:58
 * @Version 1.0
 **/
public class TestArrayAndLinked {
    public static void main(String[] args) {
        // 创建一个用数字填充的数组线性表
        List<Integer> arrayList = new ArrayList<Integer>();
        // 插入元素
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(1);
        // 在指定位置插入元素，插入元素后的线性表是[1, 10, 2, 3, 4, 1]
        arrayList.add(1, 10);
        // 在下标为4的元素前插入5，插入后的结果为[1, 10, 2, 3, 5, 4, 1]
        arrayList.add(4, 5);

        System.out.println("该数组线性表中的元素有: ");
        System.out.println(arrayList);


        // 创建一个链表, 从已经存在的arrayList集合中
        LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);
        // 从指定位置向链表中插入数据, 插入后的数据为 [1, red, 10, 2, 3, 5, 4, 1]
        linkedList.add(1, "red");
        // 移除最后一个元素, 移除后的结果为 [1, red, 10, 2, 3, 5, 4]
        linkedList.removeLast();
        // 向该链表的起始位置插入一个元素, 插入后的结果为 [green, 1, red, 10, 2, 3, 5, 4]
        linkedList.addFirst("green");
        // 向该链表的末尾插入一个元素, 插入后的结果为 [green, 1, red, 10, 2, 3, 5, 4, black]
        linkedList.addLast("black");
        System.out.println("该链表中的元素有: ");
        System.out.println(linkedList);

        // 顺序遍历该链表
        ListIterator<Object> listIterator = linkedList.listIterator();
        System.out.println("顺序遍历后的结果为: ");
        // hasNext(), 如果还有更多的元素可以遍历, 返回true
        while (listIterator.hasNext()) {
            // next(), 返回该线性表迭代器的下一个元素
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        // 反向遍历该链表
        listIterator = linkedList.listIterator(linkedList.size());
        System.out.println("反向遍历后的结果为: ");
        // hasPrevious(), 如果还有更多的元素可以遍历, 返回true
        while (listIterator.hasPrevious()) {
            // previous(), 返回该线性表迭代器的前一个元素
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();

        // 其他遍历链表方式

        // get(i)方法遍历, 不推荐，非常耗时
        System.out.println("普通for循环遍历链表(不推荐, 效率低):");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println();

        // foreach循环, 推荐
        System.out.println("foreach循环遍历链表(推荐)");
        for (Object e : linkedList) {
            System.out.print(e + " ");
        }
        System.out.println();

        // forEach()方法, 强烈推荐
        System.out.println("forEach()方法循环遍历链表(强烈推荐)");
        linkedList.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

}
