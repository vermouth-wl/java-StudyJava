package com.study.collection.List;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @Classname SortStringIgnoreCase
 * @Description TODO 在线性表中使用比较器, 忽略大小写对字符串进行排序
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-07-04 17:12
 * @Version 1.0
 **/
public class SortStringIgnoreCase {
    public static void main(String[] args) {
        // 创建字符串线性表
        List<String> list = Arrays.asList("kagura", "vermouth", "yzy");
        // 调用sort()方法进行排序
        list.sort((s1, s2) -> s2.compareToIgnoreCase(s1));

        // foreach输出
        for (String s : list) {
            // System.out.print(s + " ");
        }

        List<String> l = Arrays.asList("red", "green", "blue");
        Collections.sort(l);
        System.out.println(l);
    }
}
