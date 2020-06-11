package com.study.password;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Classname HashDemo
 * @Description TODO Hash算法Demo
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-06-09 11:10
 * @Version 1.0
 **/
public class HashDemo {
    public static void main(String[] args) throws Exception {

        // 创建一个MessageDigest实例
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");

        // 反复调用update()方法输入数据
        messageDigest.update("王磊".getBytes("UTF-8"));

        byte[] result = messageDigest.digest();

        System.out.println(new BigInteger(1, result).toString(16));

    }
}
