package com.study.refection;


import java.lang.reflect.Field;

/**
 * @Classname Reflection4
 * @Description TODO
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-04-01 11:33
 * @Version 1.0
 **/
public class Reflection4 {

    public static void main(String[] args) throws Exception {
        Object rec = new Rec("苦艾酒");
        Class cls = rec.getClass();
        Field field = cls.getDeclaredField("username");
        field.setAccessible(true);
        Object value = field.get(rec);
        System.out.println(value);
    }
}

class Rec{
    private String username;

    //
    public Rec(String username){
        this.username = username;
    }
}
