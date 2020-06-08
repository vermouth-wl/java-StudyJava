package com.study.list;


import java.util.Arrays;

public class TwoDimensionalArrayDemo {
    /**
     * 多维数组
     * @param args
     */
    public static void main(String[] args) {
        int ns[][] = {
                {1, 3, 5, 7, 9},
                {2, 4, 6, 8, 10}
        };
        System.out.println("内置方法打印结果: " + Arrays.deepToString(ns));
        System.out.println("使用for循环打印结果为: ");
        for (int[] arrs: ns) {
            for (int n: arrs) {
                System.out.print(n);
                System.out.print(",");
            }
        }
        System.out.println();

        // 求平均成绩
        double sum = 0;
        double num = 0;
        int socre[][] = {
                {120, 55, 76},
                {90, 93, 88},
                {103, 65, 78}
        };
        for (int i = 0; i < socre.length; i++) {
            for (int j = 0; j < socre[i].length; j++) {
                sum = sum + socre[i][j];
            }
            num = num + socre[i].length;
        }
        double average = sum/num;
        System.out.println( sum + "/" + num + "=" + average);

    }
}
