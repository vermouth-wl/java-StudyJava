package com.study.collection.List;

import java.util.List;

public class ArrayListDemoContainsOrIndexOfDemoTest extends ListClass {
    private String firstName;
    private String lastName;
    private Integer age;

    public ArrayListDemoContainsOrIndexOfDemoTest(String firstName, String lastName, Integer age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    // main()方法
    public static void main(String[] args) {
        List<ArrayListDemoContainsOrIndexOfDemoTest> list = List.of(
                new ArrayListDemoContainsOrIndexOfDemoTest("王", "磊", 18),
                new ArrayListDemoContainsOrIndexOfDemoTest("库", "拉索", 27),
                new ArrayListDemoContainsOrIndexOfDemoTest("贝尔", "摩得", 29),
                new ArrayListDemoContainsOrIndexOfDemoTest("黑羽", "快斗", 18),
                new ArrayListDemoContainsOrIndexOfDemoTest("工藤", "新一", 18),
                new ArrayListDemoContainsOrIndexOfDemoTest("江户川", "柯南", 18)
        );

        // 遍历list
        for (ArrayListDemoContainsOrIndexOfDemoTest s : list){
            System.out.println("姓名: " + s.firstName + s.lastName + " 年龄: " + s.age);
        }

        boolean exist = list.contains(new ArrayListDemoContainsOrIndexOfDemoTest("江户川", "柯南", 18));
        System.out.println(exist? "测试成功": "测试失败");
    }
}
