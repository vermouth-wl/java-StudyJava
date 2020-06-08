package com.study.refection;

public class Reflection1 {
    public static void main(String[] args) {

        Class cls = String.class;
        System.out.println("示例一: " + cls);

        String s = "Hello, World";
        String scls = s.getClass().getName();
        System.out.println("示例二: " + scls);


    }
}
