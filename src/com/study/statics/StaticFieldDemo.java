package com.study.statics;

public class StaticFieldDemo {

    private String username;
    private String password;

    //静态属性
    private static int number;

    //


    private StaticFieldDemo(String username, String password){
        this.username = username;
        this.password = password;
    }

    public static void main(String[] args) {
        StaticFieldDemo.number = 5;
        System.out.println(StaticFieldDemo.number);
    }
}
