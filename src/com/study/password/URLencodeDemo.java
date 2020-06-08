package com.study.password;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * @Classname URLencodeDemo
 * @Description TODO URL编码示例
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-06-08 11:32
 * @Version 1.0
 **/
public class URLencodeDemo {
    public static void main(String[] args) {

        // 加密
        String param = "超新星爆炸";
        String paramURLencode = URLEncoder.encode(param, StandardCharsets.UTF_8);
        String URL = "https://www.google.com/search?q=" + paramURLencode;
        System.out.println("编码后的URL是: " + URL);

        // 解密
        String paramDecode = URLDecoder.decode(paramURLencode, StandardCharsets.UTF_8);
        String URLdecode = "https://www.google.com/search?q=" + paramDecode;
        System.out.println("解码后的URL是: " + URLdecode);
    }
}
