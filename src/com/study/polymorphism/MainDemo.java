package com.study.polymorphism;

/**
 * @Classname MainDemo
 * @Description TODO
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-05-06 10:33
 * @Version 1.0
 **/
public class MainDemo {
    public static void main(String[] args) {
        Person p = new Person();
        p.run();
        Student s = new Student();
        s.run();
        Person x = new Student();
        x.run();
    }
}
