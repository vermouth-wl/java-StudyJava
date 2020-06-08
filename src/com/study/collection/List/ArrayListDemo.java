package com.study.collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("苦艾酒");
        arrayList.add("贝尔摩德");
        System.out.println(arrayList);

        List<String> list = List.of("王磊", "瑶");
        for (Iterator<String> iterator = list.iterator();iterator.hasNext();){
            String s = iterator.next();
            System.out.println(s);
        }

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(5);
        a.forEach(e -> System.out.print(e + " "));
    }
}
