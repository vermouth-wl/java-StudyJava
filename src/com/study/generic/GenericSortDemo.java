package com.study.generic;


/**
 * @Classname GenericSortDemo
 * @Description TODO 开发一个泛型，对对象数组进行排序
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-05-30 21:57
 * @Version 1.0
 **/
public class GenericSortDemo {
    // 排序方法(类型为受限泛型，继承Comparable泛型接口)
    public static <E extends Comparable<E>> void sort(E[] list) {
        E currentMin;
        int currentMinIndex;

        for (int i = 0; i < list.length - 1; i++) {
            currentMin = list[i];
            currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
           if (currentMinIndex != i) {
               list[currentMinIndex] = list[i];
               list[i] = currentMin;
           }
        }
    }
    public static void printList(Object[] list) {
        for (int i = 0; i<list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // 实例化数组对象
        Integer[] intArrays = {new Integer(2), new Integer(4), new Integer(3)};
        Double[] doubleArrays = {new Double(3.4), new Double(1.6), new Double(-5.5)};
        Character[] charArrays = {new Character('a'), new Character('J'), new Character('g')};
        String[] stringArrays = {new String("贝尔摩德"), new String("苦艾酒"), new String("莎朗·温亚得")};
        // 测试题
        // int[] list = {new Integer(1), new Integer(2), new Integer(-1)};

        // 调用sort()
        sort(intArrays);
        sort(doubleArrays);
        sort(charArrays);
        sort(stringArrays);

        // 显示排序后的数组
        System.out.println("整型数字数组对象排序结果:");
        printList(intArrays);

        System.out.println("浮点数字数组对象排序结果:");
        printList(doubleArrays);

        System.out.println("字符数组对象排序结果:");
        printList(charArrays);

        System.out.println("字符串数组对象排序结果:");
        printList(stringArrays);
    }
}
