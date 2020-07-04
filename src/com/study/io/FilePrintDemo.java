package com.study.io;

import java.io.File;

/**
 * @Classname FilePrintDemo
 * @Description TODO 列出指定目录下的目录和文件，并按照层次打印出来
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-06-11 14:47
 * @Version 1.0
 **/
public class FilePrintDemo {
    public static void main(String[] args) {

        // 实例化File对象,
        File file = new File("D:\\software\\visio");

        // 列出所有文件和目录
        File[] files = file.listFiles();
        printFiles(files);

    }
    static void printFiles(File[] files) {
        System.out.println("==============");
        if (files != null) {
            for (File f : files) {
                System.out.println(f);
            }
        }
        System.out.println("==============");
    }
}
