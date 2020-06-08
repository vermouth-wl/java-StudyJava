package com.study.variable;

/**
 * @Classname VariableDemo
 * @Description TODO
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-05-04 17:33
 * @Version 1.0
 **/
public class VariableDemo {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer();
        String[] names = {"苦艾酒", "贝尔摩德"};
        for (String i : names) {
            name.append(i + ", ");
        }
        System.out.println(name);
    }
}
