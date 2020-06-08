package com.study.refection;

/**
 * 从Class实例中获取基本信息
 */
public class Refection2 {
    static void printClassInfo(Class cls){
        System.out.println("Class name: " + cls.getName());
        System.out.println("Simple name: " + cls.getSimpleName());
        if (cls.getPackage() != null){
            System.out.println("Package name: " + cls.getPackage().getName());
        }
        System.out.println("is interface: " + cls.isInterface());
        System.out.println("is enum: " + cls.isEnum());
        System.out.println("is arry: " + cls.isArray());
        System.out.println("is primitive: " + cls.isPrimitive());
    }

    public static void main(String[] args) {
        printClassInfo("".getClass());
        System.out.println();
        printClassInfo(Runnable.class);
        System.out.println();
        printClassInfo(java.time.Month.class);
        System.out.println();
        printClassInfo(int[].class);
        System.out.println();
        printClassInfo(int.class);
    }
}
