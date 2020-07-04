package com.study.collection.List;

/**
 * @Classname SortStringByLength
 * @Description TODO 比较字符串长度实例
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-07-04 16:54
 * @Version 1.0
 **/
public class SortStringByLength {

    public static class MyComparator implements java.util.Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return s1.length() - s2.length();
        }
    }

    public static void main(String[] args) {
        String[] cities = {"南坪", "四公里", "工商大学", "是"};
        java.util.Arrays.sort(cities, (s1, s2) -> s1.length() - s2.length());

        for (String s : cities) {
            System.out.print(s + " ");
        }
    }
}
