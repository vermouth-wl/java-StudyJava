package com.study.refection;

import java.lang.reflect.Method;

/**
 * @Classname Reflection7
 * @Description TODO
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-04-01 17:25
 * @Version 1.0
 **/
public class Reflection7 {
    public static void main(String[] args) throws Exception {
        String word = "Hello World";
        System.out.println("正常执行String对象的substring()方法返回结果为: " + word.substring(6));

        // 获取string类上substring()方法，参数为int
        Method method = String.class.getMethod("substring", int.class);

        // 在word对象上调用method方法并获取结果
        String result = (String) method.invoke(word, 6);
        System.out.println("通过反射机制执行String类中的substring()方法返回结果为: " + result);
    }
}
