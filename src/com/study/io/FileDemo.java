package com.study.io;

import java.io.File;
import java.io.IOException;

/**
 * @Classname FileDemo
 * @Description TODO 使用File对象来操作文件和目录
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-06-11 10:03
 * @Version 1.0
 **/
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("F:\\developDemo\\java\\javaStudy");
        System.out.println(file);
        System.out.println(file.getAbsolutePath());
        System.out.println("该对象是否为文件: " + file.isFile());  // 判断对象是否是一个文件
        System.out.println("该对象是否为目录: " + file.isDirectory());  // 判断对象是否是一个目录
        System.out.println("该文件是否可读: " + file.canRead());  // 判断文件是否可读
        System.out.println("该文件是否可写: " + file.canWrite());  // 判断文件是否可写

    }
}
