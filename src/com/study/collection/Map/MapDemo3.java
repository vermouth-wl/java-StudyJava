package com.study.collection.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname MapDemo3
 * @Description TODO
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-04-10 11:28
 * @Version 1.0
 **/
public class MapDemo3 {

    public static void main(String[] args) {
        Map<String, ? super Boolean> testMap = new HashMap<>();
        testMap.put("测试", false);
        boolean o = (Boolean) testMap.get("测试");
        System.out.println(o);
    }
}
