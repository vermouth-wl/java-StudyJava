package com.study.input_output;


/**
 * @Classname OutPutDemo
 * @Description TODO
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-04-30 14:52
 * @Version 1.0
 **/
public class OutPutDemo {
    public static void main(String[] args) {
        double a = Math.PI;
        System.out.println("a的值为： " + a);
        System.out.printf("a保留两位小数后的值为: %.2f", a);
        System.out.println();
        System.out.printf("a保留四位小数后的值为: %.4f", a);
    }
}
