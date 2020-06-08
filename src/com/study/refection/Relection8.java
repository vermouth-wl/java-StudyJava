package com.study.refection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Classname Relection8
 * @Description TODO
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-04-02 10:10
 * @Version 1.0
 **/
public class Relection8 {
    public static void main(String[] args) throws Exception {
        User user = new User();

        // 获取字节码对象
        Class cls = user.getClass();

        // 获取私有类型字段
        Field f1 = cls.getDeclaredField("username");
        Field f2 = cls.getDeclaredField("address");
        Field f3 = cls.getDeclaredField("age");

        // 设置私有属性可见
        f1.setAccessible(true);
        f2.setAccessible(true);
        f3.setAccessible(true);

        // 修改属性
        f1.set(user, "神乐");
        f2.set(user, "战国时代");
        f3.set(user, 18);

        // 获取User类上的showMyself()方法, 无参数
        Method method = User.class.getMethod("showMyself");

        // 在user对象上执行方法并返回结果
        String result = (String) method.invoke(user);
        System.out.println(result);
    }
}

class User{
    private String username;
    private String address;
    private Integer age;

    //
    public User(){}
    public User(String username, String address, Integer age){
        this.username = username;
        this.address = address;
        this.age = age;
    }

    //
    public String showMyself(){
        return "我的名字是 " + getUsername() + ", 今年 " + getAge() + " 岁, 我来自 " + getAddress();
    }

    //

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}