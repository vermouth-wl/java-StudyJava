package com.study.password;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Base64;

/**
 * @Classname Base64Demo
 * @Description TODO Base64编码示例
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-06-08 11:54
 * @Version 1.0
 **/
public class Base64Demo {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String txt = "原来诀别是因为深藏眷恋，你用轮回换我枕边月圆。";
        String Base64Encode = Base64.getEncoder().encodeToString(txt.getBytes());
        System.out.println("Base64编码后结果为: " + Base64Encode);

        byte[] Base64Decode = Base64.getDecoder().decode(Base64Encode);
        String str = new String(Base64Decode, "UTF-8");
        System.out.println(str);
    }
}
