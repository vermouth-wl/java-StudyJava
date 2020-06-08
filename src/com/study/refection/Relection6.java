package com.study.refection;


/**
 * @Classname Relection6
 * @Description TODO
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-04-01 15:04
 * @Version 1.0
 **/
public class Relection6 {

    public static void main(String[] args) throws Exception {

        Cat cat = new Cat();
        Class cls = cat.getClass();

        // 获取public方法getScore, 参数为string
        System.out.println(cls.getMethod("getScore", String.class));

        // 获取集成的方法getName, 无参数
        System.out.println(cls.getMethod("getName"));

        // 获取私有的 方法getGrade, 参数为int
        System.out.println(cls.getDeclaredMethod("getGrade", int.class));
    }


}

class Animal{
    public String getName(){
        return "Aniaml";
    }
}

class Cat extends Animal{
    public int getScore(String type){
        return 150;
    }
    private int getGrade(int year){
        return 1;
    }
}
