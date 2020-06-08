package com.study.refection;

/**
 * @Classname Reflection3
 * @Description TODO
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-04-01 11:11
 * @Version 1.0
 **/
public class Reflection3 {
    public static void main(String[] args) throws Exception {
        Class cls = Student.class;
        // 获取public字段score
        System.out.println(cls.getField("score"));
        // 获取继承的public字段name
        System.out.println(cls.getField("name"));
        // 获取private字段
        System.out.println(cls.getDeclaredField("grade"));
    }
}

class Student extends Person{
    public int score;
    private int grade;
}

class Person{
    public String name;
}
