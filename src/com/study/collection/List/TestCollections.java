package com.study.collection.List;

import java.util.*;

/**
 * @Classname TestCollections
 * @Description TODO 线性表和集合的静态方法
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-07-04 18:00
 * @Version 1.0
 **/
public class TestCollections {
    public static void main(String[] args) {
        // 创建一个线性表
        List<String> arrayList = Arrays.asList("red", "green", "blue");
        // 调用Collections的sort()方法来对线性表进行升序排序
        Collections.sort(arrayList);
        System.out.println("Collections的sort()方法升序排序结果为: " + arrayList);

        // 调用Collections的sort()方法来对线性表进行降序排序
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println("Collections的sort()方法降序排序结果为: " + arrayList);


        // 使用Collections的binarySearch()方法在线性表中查找一个键值
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15, 17, 19);
        // binarySearch(list, key) 采用二分查找法查找排序好的线性表中的键值, 键=元素, 值=索引
        System.out.println("(1) index: " + Collections.binarySearch(list, 11));
        System.out.println("(2) index: " + Collections.binarySearch(list, 4));

        List<String> stringList  = Arrays.asList("blue", "green", "red");
        System.out.println("(3) index: " + Collections.binarySearch(stringList, "red"));
        System.out.println("(4) index: " + Collections.binarySearch(stringList, "yellow"));


        // 使用Collections的reverse()方法将线性表中的元素以逆序排列显示
        List<String> personList = Arrays.asList("vermouth", "kagura", "kikyo");
        Collections.reverse(personList);
        System.out.println("Collections的reverse()方法逆序排列后的结果为: " + personList);


        // 使用Collections的shuffle()方法将线性表中的元素打乱排列
        List<String> animalList = Arrays.asList("pig", "dog", "cat", "bird", "bug", "spider", "snake");
        Collections.shuffle(animalList);
        System.out.println("Collections的shuffle()方法打乱排序后的结果为: " + animalList);

        List<String> carList1 = Arrays.asList("bmw", "aodi", "benz");
        List<String> carList2 = Arrays.asList("bmw", "aodi", "benz");
        Collections.shuffle(carList1, new Random(20));
        Collections.shuffle(carList2, new Random(20));
        System.out.println("Collections的shuffle()方法打乱排序后的结果为: " + carList1);
        System.out.println("Collections的shuffle()方法打乱排序后的结果为: " + carList2);


        // 使用Collections的copy()方法来将源线性表中的元素以相同位置下表插入到目标线性表中
        List<Integer> integerList1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> integerList2 = Arrays.asList(2, 4, 6, 8);
        Collections.copy(integerList1, integerList2);
        System.out.println("Collections的copy()方法复制后的结果为: " + integerList1);
    }
}
