package com.study.list;

/**
 * @Classname PointerDemo
 * @Description TODO
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-04-30 14:44
 * @Version 1.0
 **/
public class PointerDemo {
    public static void main(String[] args) {
        String[] names = {"苦艾酒", "贝尔摩德", "vermouth"};
        String s = names[1];
        names[1] = "蓓摩得";
        System.out.println(s);
    }
}
