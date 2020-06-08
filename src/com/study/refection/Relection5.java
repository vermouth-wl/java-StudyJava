package com.study.refection;

import java.lang.reflect.Field;

/**
 * @Classname Relection5
 * @Description TODO
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-04-01 14:24
 * @Version 1.0
 **/
public class Relection5 {
    public static void main(String[] args) throws Exception {

        // 初始化对象
        Demo demo = new Demo("刘宇", 22);

        // 获取demo的字节码对象
        Class cls = demo.getClass();

        // 获取属性
        Field f1 = cls.getDeclaredField("username");
        Field f2 = cls.getDeclaredField("age");

        // 允许访问私有类型
        f1.setAccessible(true);
        f2.setAccessible(true);

        // 获取属性中的值
        Object val1 = f1.get(demo);
        Object val2 = f2.get(demo);

        // 修改属性中的值
        f1.set(demo, "王磊");
        f2.set(demo, 24);

        System.out.println("该对象中的值1为: " + val1 + ", 值2为: " + val2);
        System.out.println("属性值已经修改, 修改后结果为: " + demo.getUsername() + " " + demo.getAge());
    }
}

class Demo{
    private String username;
    private Integer age;

    // init
    public Demo(String username, Integer age){
        this.username = username;
        this.age = age;
    }

    // setter getter

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
