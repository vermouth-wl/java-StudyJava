package com.study.list;

import java.util.Arrays;

public class ArraySortDemo {
    /**
     * 对数组进行排序，使用冒泡排序方法
     * 原理：比较两个相邻的元素，将值大的放到右边
     * 计算：N个数字要进行排序，需要进行N-1趟排序才能排完，每i趟排序需要进行N-i次排序
     * 例如：要对5个数字进行排序，需要4趟才能排完，第一趟需要3次，第二趟需要2次，第三趟需要1次……
     */
    public static void main(String[] args) {
        //定义一个数组
        int[] ns = {23, 12, 42, 27, 15};
        //排序前
        System.out.println("数组排序前的值为: " + Arrays.toString(ns));
        //开始排序
        //现在对5个数字进行排序，一共需要4躺，i层控制趟数
        for (int i = 0; i < ns.length - 1; i++) {
            //控制每趟的次数
            for (int j = 0; j < ns.length - i - 1; j ++) {
                //每次比较两个相邻的数字，将大的数字放到右边，需要一个tmp变量
                if (ns[j] > ns[j+1]) {
                    int tmp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = tmp;
                }
            }
        }
        System.out.println("数组排序后的值为: " + Arrays.toString(ns));

        //利用内置方法进行排序
        int[] ls = {1, 4, 3, 9, 8};
        Arrays.sort(ls);
        System.out.println("内置方法排序后的值为: " + Arrays.toString(ls));

        //对数组进行降序排序
        for (int i = 0; i < ns.length - 1; i++) {
            for (int j = 0; j < ns.length - i -1; j++) {
                if(ns[j] < ns[j+1]){
                    int tmp = ns[j+1];
                    ns[j+1] = ns[j];
                    ns[j] = tmp;
                }
            }
        }
        System.out.println("降序后排序的值为: " + Arrays.toString(ns));
        if (Arrays.toString(ns).equals("[42, 27, 23, 15, 12]")){
            System.out.println("降序排序成功");
        } else {
            System.out.println("降序排序失败");
        }
    }
}
